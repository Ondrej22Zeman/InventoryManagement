public class Item {
    private int id;

    public Item(int id, int quantity, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    private int quantity;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
