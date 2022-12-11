package homework_29;

public interface Order {
    public boolean addItem(Item items);
    public boolean deleteItem(String name);
    public int deleteAllItems(String name);
    public void print();
    public int getItemNumbers();
    public Item[] getItems();
    public int getFullCost();
    public int getNumbersByName(String name);
    public String[] getAllNames();
    public Item[] sort();
}
