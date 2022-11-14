public class Main {
    public static void main(String[] args) {

        Item item1 = new Item(1, 2, "pomeranč");
        Item item2 = new Item(2, 99, "jablko");
        Item item3 = new Item(3, 35, "hruška");
        Item item4 = new Item(4, 60, "meloun");

        Item[] currentInventory = {
                item2, item1, item4
        };
        Item[] newInventory = {
                item1, item1, item1, item1, item1, item3, item1, item4, item3
        };

        UpdateInventory updateInventory = new UpdateInventory();

        updateInventory.checkNewInventory(newInventory, currentInventory);

    }
}