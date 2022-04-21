package W1Game;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class GameApplication extends JFrame {
    public final int panelDims = 800;
    public final int windowBorders = 20;

    public GameApplication() {
        setSize(windowBorders + panelDims + windowBorders, windowBorders + panelDims + windowBorders + 65);
        add(new W1Game());
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // null puts it at the center of the screen when run
        // add resizability later=
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            GameApplication newGame = new GameApplication();
            newGame.setVisible(true);
        });

    }
}
