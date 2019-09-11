import javax.swing.*;
import java.awt.*;

public class GUI2_Components {
    public static void main(String[] args) {
        String[] idol={"EXO", "NCT", "BTS", "Apink", "EXID", "SNSD", "Taylor Swift ", "Kang Sky "};

        JFrame frame = new JFrame("Component");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox2");
        JCheckBox ch1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);
        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2,10);
        JComboBox<String> combobox= new JComboBox<>(idol);
        combobox.addItem("One Direction");
        combobox.addItem("Mika");

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(ch1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(combobox);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(400,200));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
