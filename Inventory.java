package W1Game;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> slots;
    public Inventory(int n) {
        slots = new ArrayList<Item>(n); // makes a new inventory of size n
        initInventory();
    }
    public ArrayList<Item> inventoryContents() { //
        return slots; // returns inventory contents
    }
    public void addToInventoryAtIndex(Item e, int index) {
        if (slots.get(index-1).hasItem) {
            System.out.println(e.toString() + " cannot be added to Slot " + index + ", "+slots.get(index-1)+" is already in this slot."); // future click and swap
        }
        else {
            slots.set((index-1),e); // CRITICAL : SETS TO INDEX-1, SLOT CORRECTION OCCURRING IN FUNCTION
            System.out.println("Added "+e.toString()+" to Slot " + index);
        }
    } // write adding conditions, such as what if full or already has item
    public void addToInventory(Item e) {
        int fullCounter = 0;
        for (Item x : slots) {
            if (!x.hasItem) {
                slots.set(slots.indexOf(x),e);
                break;
            }
            else {
                fullCounter++;
            }
            if (fullCounter == slots.size() - 1) {
                System.out.println("Item cannot be added, Inventory full.");
            }
        }
    }
    private void initInventory() { // initialize the inventory
        for (int i = 0; i < 10; i++) {
           slots.add(new Item("","misc",false, 0));
        }
    }
}
