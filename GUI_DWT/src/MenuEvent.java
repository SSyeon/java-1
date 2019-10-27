import java.awt.event.*;

public class MenuEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("직접 쓰기")) {
			System.out.println("냐옹");
	}else if(cmd.equals("추천 받기")) {
		System.out.println("랜덤함수 돌리기");
	}else if(cmd.equals("개발자 칭찬하기")) {
		System.out.println("하");
	}
}
}
