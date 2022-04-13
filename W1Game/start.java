package W1Game;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner textInput = new Scanner(System.in);
        String playerInput;
        System.out.println("Start Game?");

        while(true) {

            playerInput = textInput.nextLine();

            if (playerInput.matches("y|Y|yes|Yes|YES")) {
                System.out.println("What will your explorer be called?");
                prologue();
            }

            if (playerInput.matches("n|N|no|No|NO")) {
                System.exit(0);
            }

            else {
                System.out.println("Error: ur gay");
                System.exit(0);
            }
        }
    }

    public static void createCharacter(String charName) {
        Character mainChar = new Character(charName);
        mainChar.initChar();
    }

    public static void prologue() {
        Scanner textInput = new Scanner(System.in);
        String playerInput;

        playerInput = textInput.nextLine();
            createCharacter(playerInput);
    }
}
