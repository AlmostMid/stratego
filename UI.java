import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class UI {

    public void Run() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Start Game");
        button.setBounds(50, 100, 95, 30);
        button.setVisible(true);
        button.setLocation(450, 450);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Stratego");
        frame.setVisible(true);
        frame.add(button);

        

    }
    
}
