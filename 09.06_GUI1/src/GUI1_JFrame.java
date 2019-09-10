import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창 이름");
        JPanel panel = new JPanel();

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
