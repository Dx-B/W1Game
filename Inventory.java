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
    public void addToInventory(Item e, int index) {
        slots.set((index-1),e);
        System.out.println("Added "+e.toString()+" to Slot " + index);
    } // write adding conditions, such as what if full or already has item
    private void initInventory() { // initialize the inventory
        for (int i = 0; i < 10; i++) {
           slots.add(new Item("","misc",false, 0));
        }
    }
}
