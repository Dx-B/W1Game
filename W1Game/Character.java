package W1Game;

import java.util.Arrays;

public class Character {
    private String name;
    private Inventory cInventory;
    public Character(String n) {
        name = n;
    }
    public void run() {
    }
    public String name() {
        return name;
    }

    public void initChar() {
        System.out.println("Welcome Lord "+name + " to post-brexit Britain! Your starter bag begins with 10 slots.");
        cInventory = new Inventory(10);
    }

    public void returnInventory() {
        System.out.println("This is " + name + "'s current inventory: " + cInventory.inventoryContents());
    }
    public Inventory inventory() {
        return cInventory;
    }
}
