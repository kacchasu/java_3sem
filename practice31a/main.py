import os
import zlib
class GitVizualizer:
    def __init__(self):
        self.repos = os.getcwd() # получаем текущую директорию
        self.commits=[]
        self.trees=[]
        self.blobs=[]
        self.nodes=[]
        self.graph=[]


    def get_objects(self): #берем все объекты их папки git
        file_path = self.repos + "\\.git\\objects" ##
        for i in os.walk(file_path):
            obj = os.path.split(i[0])
            print(obj)
            if len(obj[-1])==2:  # папка - название которой - первые 2 символа хеша
                folder = obj
            else:
                folder=None  # иначе не нужно
            if folder is not None:
                for j in (i[-1]):
                    file_path = os.path.join(folder[0],folder[1] + "\\" + j)  # получаем строку пути файла с которой будем работать
                    info = zlib.decompress(open(file_path, 'rb').read()) #  разархивируем
                    type = info.split()[0].decode('utf-8')  # что содержит объект
                    if type == "tree":
                        tree={"type": info.split()[0].decode('utf-8'),
                              "name": folder[-1] + j,
                              "text": info.split()[1].decode('utf-8')[info.split()[1].find(b'\x00') + 1:]}
                        files = []
                        for file in info.split(b" ")[2:]:
                            file_way = file_path + "\\" + file[file.find(b'\x00') + 1:][0:20].hex()[0:2] + \
                                       "\\" + file[file.find(b'\x00') + 1:][:20].hex()[2:]
                            file_info = zlib.decompress(open(file_way, 'rb').read())
                            file_what = file_info.split()[0].decode('utf-8')
                            files.append({
                                "type": file_what,
                                "name": file[:file.find(b'\x00')].decode('utf-8'),
                                "path": file[file.find(b'\x00') + 1:][:20].hex()
                            })
                            tree["files"] = files
                            self.trees.append(tree)
                    elif type == "commit":
                        content = info.split(b'\n')
                        commit = {"type": content[0].split()[0].decode('utf-8'),
                                  "name": folder[-1] + j,
                                  "parent": []}
                        for u in range(len(content) - 3):
                            if b"tree" in content[u]:
                                commit["tree"] = content[u].split()[-1].decode('utf-8')
                            elif b"parent" in content[u]:
                                parent = content[u].split()[1:]
                                for k in range(len(parent)):
                                    commit["parent"].append(parent[k].decode('utf-8'))
                        for u in range(len(content[-3:])):
                            if content[-3:][u] != b"":
                                commit["text"] = content[-3:][u].decode('utf-8')
                                break
                        self.commits.append(commit)
                    elif type == "blob":
                        blob = {"type": info.split()[0].decode('utf-8'),
                                "name": folder[-1] + j,
                                "text": info.split()[1].decode('utf-8')[info.split()[1].find(b'\x00') + 1:]}
                        self.blobs.append(blob)

            def create_nodes(self):
                union = self.commits + self.trees + self.blobs
                for i in range(len(union)):
                    node = {}
                    name = str(i + 1)
                    node["obj"] = union[i]["name"]
                    node["name"] = name
                    node["type"] = union[i]["type"]
                    node["parent"] = []
                    if union[i]["type"] == "commit":
                        node["parent"] = union[i]["parent"]
                        node["text"] = f"Commit: {union[i]['text']}"
                    elif union[i]["type"] == "tree":
                        tree_name = ""
                        for commit in self.commits:
                            if commit["tree"] == union[i]["name"]:
                                node["parent"].append(commit["name"])
                        for tree in self.trees:
                            for file in tree["files"]:
                                if file["path"] == union[i]["name"]:
                                    node["parent"].append(tree["name"])
                                    tree_name = file["name"]
                                    break
                        node["text"] = f"Tree: {tree_name if tree_name != '' else 'tree'}"
                    elif union[i]["type"] == "blob":
                        file_name = ""
                        for tree in self.trees:
                            for file in tree["files"]:
                                if file["path"] == union[i]["name"]:
                                    node["parent"].append(tree["name"])
                                    file_name = file["name"]
                                    break
                        node["text"] = f"Blob: {file_name}"
                    self.nodes.append(node)

            def make_graph(self):
                self.graph = "digraph G {\n"
                for node in self.nodes:
                    self.graph += f' {node["name"]}[label="{node["text"]}"]\n'
                for node in self.nodes:
                    parents = []
                    for i in range(len(node["parent"])):
                        for j in self.nodes:
                            if j["obj"] == node["parent"][i]:
                                parents.append(j["name"])
                    for i in range(len(parents)):
                        if not ("Commit" in parents[i] or "Commit" in node["text"]):
                            self.graph += f' {parents[i]} -> {node["name"]}\n'
                self.graph += "}"


            def execute(self):
                self.get_objects()
                self.create_nodes
                self.make_graph()
                print(self.graph)


if __name__ == '__main__':
    git = GitVizualizer()
    git.get_objects()


# See PyCharm help at https://www.jetbrains.com/help/pycharm/
