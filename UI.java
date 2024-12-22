import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public class UI {

    public void Run() {
        JFrame frame = new JFrame();
        JLabel startScreenLabel = new JLabel(new ImageIcon("Stratego_pixel_art_screen.png"));
        startScreenLabel.setSize(1000, 1000);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Stratego");
        frame.setVisible(true);
        frame.add(startScreenLabel);

        

    }
    
}
