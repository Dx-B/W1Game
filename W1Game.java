package W1Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class W1Game extends JPanel implements ActionListener {

        private static String gameString;

        private Timer timer;
        private JLabel console;

        public void outputToGameWindow(String x) {
                gameString = x;
        }

        public W1Game() {
                super();
                timer = new Timer(1, this);
                timer.start();
                // timer.stop(); // guess what this does
                initLabels();
                addToGameWindow();
        }

        public void addToGameWindow() {
                GridBagConstraints c = new GridBagConstraints();
                c.anchor = GridBagConstraints.FIRST_LINE_START;
                c.fill = GridBagConstraints.HORIZONTAL;
                c.insets = new Insets(1, 1, 0, 1);
                c.gridx = 0;
                c.gridy = 1;
                c.gridwidth = 6;
                c.gridheight = 10;
                add(console, BorderLayout.CENTER);
        }

        public void initLabels() {
                gameString = "Debug Text";
                console = new JLabel(gameString);
                console.setFont(new Font("Serif",Font.BOLD,30));
                console.setForeground(Color.WHITE);
                console.setBackground(Color.BLACK);
                console.setOpaque(true);
        }

        public void actionPerformed(ActionEvent e) { // timer ticking :D
                // System.out.println("Cheese");
        }

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////

        private static Character mainCharacter;

        /*
        public static void main(String[] args) {
                // launch();
                debug(); // this function is for debug
        }
        */


        public static void createCharacter(String charName) {
                mainCharacter = new Character(charName);
                mainCharacter.initChar();
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

