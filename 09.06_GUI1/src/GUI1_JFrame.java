import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창 이름");
        int 창w=400;
        int 창h=200;
        Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w =(int)(dimen.getWidth());
        int 화h = (int) (dimen.getHeight());
        JPanel panel = new JPanel();

        frame.setPreferredSize(new Dimension(창w,창h));
        frame.setLocation((화w-창w)/2,(화h-창h)/2);

        JLabel label = new JLabel("드디어 금요일이당!!!");
        JButton btn = new JButton("오예");

        panel.add(label);
        panel.add(btn);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
