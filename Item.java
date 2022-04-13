package W1Game;

public class Item {
    boolean hasItem;
    private String itemName;
    private int rarity;
    private String itemType;
    public Item(String name, String type, boolean occupiesInvenSlot, int itemRarity) {
        itemName = name;
        hasItem = occupiesInvenSlot;
        rarity = itemRarity;
        itemType = type;
    }

    public int getRarity() {
        return rarity;
    }
    public String getName() {
        return itemName;
    }
    public void getItemStats() {
        System.out.println("Name: "+itemName+"\n"+"Catagory: "+itemType+"\n"+"Rarity: "+rarity);
    }
    public String toString() { // default "empty" case
        if (!hasItem) {
            return "empty";
        }
        else {
            return itemName;
        }
    }
}

class Weapon extends Item {
    public Weapon(String name, String type, boolean occupiesInvenSlot, int itemRarity) {
        super(name, type, occupiesInvenSlot, itemRarity);
    }
}
