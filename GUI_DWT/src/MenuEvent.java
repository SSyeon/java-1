import java.awt.event.*;

public class MenuEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("���� ����")) {
			System.out.println("�Ŀ�");
	}else if(cmd.equals("��õ �ޱ�")) {
		System.out.println("�����Լ� ������");
	}else if(cmd.equals("������ Ī���ϱ�")) {
		System.out.println("��");
	}
}
}
