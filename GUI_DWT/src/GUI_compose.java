import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

public class GUI_compose extends JFrame {
	GUI_Eng GE;
	GUI_Lec GL;

	GUI_compose() {

		setTitle("Log In");
		
		this.setLayout(new GridLayout(3,1));
		
		createMenu();
		infoPanel();
		createButton();
		
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();

		JMenuItem[] item1 = new JMenuItem[3];

		String[] itemTitle = { "추천 받기", "직접 쓰기", "개발자 칭찬하기" };

		JMenu goalMenu = new JMenu("Help");

		for (int i = 0; i < item1.length; i++) {
			item1[i] = new JMenuItem(itemTitle[i]);
			item1[i].addActionListener(new MenuEvent());
			goalMenu.add(item1[i]);
		}

		mb.add(goalMenu);

		this.setJMenuBar(mb);
	}

	void infoPanel() {
		JPanel when = new JPanel();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());
		System.out.println(strToday);
		
		JLabel date = new JLabel(strToday, SwingConstants.CENTER);
		date.setFont(new Font("돋움", Font.BOLD, 40));
		date.setForeground(Color.PINK);
		when.add(date);
		
		JPanel goal = new JPanel();		
		JLabel can = new JLabel("냐옹", SwingConstants.CENTER);
		can.setFont(new Font("돋움", Font.BOLD, 30));
		can.setForeground(Color.RED);
		
		goal.add(can);

		this.add(when);
		this.add(goal);
		
	}


	void createButton() {
		JPanel BtnPn1 = new JPanel();
		BtnPn1.setLayout(new FlowLayout());

		JButton eng = new JButton("영어공부하기");
		eng.setPreferredSize(new Dimension(250, 100));
		eng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (GE == null) {
					GE = new GUI_Eng();
				} else {
					GE.dispose();
					GE = new GUI_Eng();
				}
			}
		});

		JButton lec = new JButton("강의보기");
		lec.setPreferredSize(new Dimension(250, 100));
		lec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (GL == null) {
					GL = new GUI_Lec();
				} else {
					GL.dispose();
					GL = new GUI_Lec();
				}
			}
		});
		BtnPn1.add(eng);
		BtnPn1.add(lec);

		this.add(BtnPn1);
	}
}
