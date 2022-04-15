package W1Game;

import java.util.ArrayList;

public class Crate {
    private final String boxName;
    private int boxQuality;
    ArrayList<Item> boxContents = new ArrayList<Item>();

    public Crate(String type) {
        boxName = type;
    }

    public String name() {
        return boxName;
    }

    public Item open() {
        for (Item x : boxContents) {
            System.out.println("Added " + x + " to Inventory." ); // add 8x,4x,2x soon (multiple items)
            return x;
        }
        return null;
    }

    public void addToCrate(Item e) {
        boxContents.add(e);
    }

    public ArrayList<Item> seeContents () {
        return boxContents;
    }
}
