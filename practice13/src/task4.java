import java.util.StringTokenizer;

public class task4 {
    private String s;
    private String title;
    private String color;
    private String size;

    public task4(String shirt) {
        StringTokenizer parts = new StringTokenizer(shirt, ",");
        this.s = parts.nextToken();
        this.title = parts.nextToken();
        this.color = parts.nextToken();
        this.size = parts.nextToken();
    }

    @Override
    public String toString() {
        return "shirt{" +
                "s='" + s + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        task4[] shirtss = new task4[11];
        for(int i = 0; i < 11; i++) {
            shirtss[i] = new task4(shirts[i]);
            System.out.println(shirtss[i]);
        }
    }
}
