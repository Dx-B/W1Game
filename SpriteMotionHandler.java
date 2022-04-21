package W1Game;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpriteMotionHandler extends JFrame {

    public SpriteMotionHandler() {
        initUI();
    }

    private void initUI() {
        add(new W1Game());
        setTitle("Moving sprite");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpriteMotionHandler ex = new SpriteMotionHandler();
            ex.setVisible(true);
        });
    }
}

