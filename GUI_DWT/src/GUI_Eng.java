import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.AncestorListener;

public class GUI_Eng extends JDialog implements ActionListener {
	private int cnt = 0;
	JLabel wordCnt = new JLabel(Integer.toString(cnt) + " /30");
	String engW, engM, form, column, msg;
	JTextArea iWord, iMean, list;
	JButton add;
	JPanel insert;

	GUI_Eng() {
		setTitle("WordStudy");

		setLayout(new FlowLayout());

		compose();

		setSize(500, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	void compose() {
		wordCnt.setFont(new Font("Arial", Font.BOLD, 20));

		insert = new JPanel();
		iWord = new JTextArea(1, 5);
		iWord.registerKeyboardAction(this, "add", KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), JComponent.WHEN_FOCUSED);

		iMean = new JTextArea(1, 8);

		iWord.setFont(new Font("Airal", Font.BOLD, 25));
		iMean.setFont(new Font("Airal", Font.BOLD, 25));

		iWord.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_TAB) {
					iMean.requestFocus();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});

		add = new JButton("입력");
		add.setActionCommand("add");
		add.addActionListener(this);

		insert.add(iWord);
		insert.add(iMean);
		insert.add(add);

		column = "단어 \t\t\t 뜻\n___________________________________________";
		list = new JTextArea();
		list.setEditable(false);
		list.setFont(new Font("돋움", Font.BOLD, 15));
		list.append(column);

		this.add(wordCnt);
		this.add(insert);
		this.add(list);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "add") { // 엔터치면 자동입력,tab 누르면 옆으로 가는거!!
			engW = iWord.getText();
			engM = iMean.getText();
			System.out.println(engW);
			System.out.println(engM);

			cnt++;
			if (cnt >= 4) {
				msg = "♥♥♥♥♥";
				iWord.setEditable(false);
				iWord.setText(msg);

				msg = "한 세트 완성!";
				iMean.setEditable(false);
				iMean.setText(msg);

				add.removeActionListener(this);

			}
			wordCnt.setText(cnt + " /30");
			System.out.println(cnt);
			createSheet();
			list.append("\n" + engW + "\t\t" + engM);
			
			iWord.setText("");
			iMean.setText("");

			iWord.requestFocus();
		}
	}

	void createSheet() {
		form = engW + "\t\t" + engM + "\n";
		File file = new File("test1.txt");
		FileWriter writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write(form);
			writer.flush();
			System.out.println("DONE");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
