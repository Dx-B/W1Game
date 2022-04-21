package W1Game;
import java.util.Scanner;

public class startTextVariation {

    private static Character mainCharacter;

    public static void main(String[] args) {
        // launch();
        debug(); // this function is for debug
        }


    public static void createCharacter(String charName) {
        mainCharacter = new Character(charName);
        mainCharacter.initChar();
    }

    public static void launch() {
        Scanner textInput = new Scanner(System.in);
        String playerInput;
        System.out.println("Start Game?");

        playerInput = textInput.nextLine();

        if (playerInput.matches("y|Y|yes|Yes|YES")) {
            System.out.println("What will your explorer be called?");
            prologue();
            chestSegment();
            debug();
        }

        if (playerInput.matches("n|N|no|No|NO")) {
            System.exit(0);
        }

        else {
            System.out.println("Error: u ded");
            System.exit(0);
        }
    }

    public static void prologue() {
        Scanner textInput = new Scanner(System.in);
        String playerInput;

        playerInput = textInput.nextLine();
            createCharacter(playerInput);
    }
    public static void chestSegment() {
        System.out.println("You come across what appears to be an old, dust-covered wooden chest with a rusty lock."+"\n"+"Upon closer inspection, the lock looks nearly shattered, and it breaks open upon your touch.");
        System.out.println("The chest springs open, revealing its contents.");
    }
    public static void debug() {
        createCharacter("Gladiator");
        String playerInput;
        while (mainCharacter.hp() != 0) {
            Scanner textInput = new Scanner(System.in);
            playerInput = textInput.nextLine();
            System.out.println("Welcome to the Arena, Challenger " + mainCharacter.name() + "!");
            
        }
    }
}
