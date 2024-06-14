package market;

public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', description='" + description + "'}";
    }
}