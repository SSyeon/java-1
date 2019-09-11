import javax.swing.*;
import java.awt.*;

public class Sample {
    public static void main(String []args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.add(panel);

        frame.setPreferredSize(new Dimension(400,200));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
