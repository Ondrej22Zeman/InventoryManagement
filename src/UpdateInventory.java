import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Arrays;

public class UpdateInventory {
    public Item[] checkNewInventory(Item[] newInv, Item[] currentInv) {
        int temp = 0;
        int sameItemsCounter = 0;

        ArrayList<Item> duplicateCurrentAndNewList = new ArrayList<>();
        ArrayList<Item> duplicateNewItems = new ArrayList<>();

        for (Item newItem : newInv) {
            boolean duplicateItem = false;
            for (Item item : duplicateNewItems) {
                if (item.getId() == newItem.getId()) {
                    item.setQuantity(item.getQuantity() + newItem.getQuantity());
                    duplicateItem = true;
                    sameItemsCounter++;
                }
            }
            if (!duplicateItem) {
                Item tempItem = new Item(newItem.getId(),
                        newItem.getQuantity(),
                        newItem.getName()
                );
                duplicateNewItems.add(tempItem);
            }
        }




        for (Item newItem : duplicateNewItems) {
            for (Item currItem : currentInv) {
                if (currItem.getId() == newItem.getId()) {
                    currItem.setQuantity(currItem.getQuantity() + newItem.getQuantity());
                    if (!duplicateCurrentAndNewList.contains(newItem)) {
                        duplicateCurrentAndNewList.add(newItem);
                    }
                    sameItemsCounter++;
                }
            }
        }


        Item[] updatedInv = Arrays.copyOf(currentInv, currentInv.length + newInv.length - sameItemsCounter);

        int i = currentInv.length;
        for (Item item :
                duplicateNewItems) {
            if (!duplicateCurrentAndNewList.contains(item)) {
                duplicateCurrentAndNewList.add(item);
                updatedInv[i] = item;
                i++;

            }
        }

        for (Item item :
                updatedInv) {
            System.out.println(item.getQuantity() + " " + item.getName());
        }


        return newInv;
    }

    public UpdateInventory() {
    }
}
