package ������;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {
		// �̸��� �Է��ؼ�, ���
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");//������ �ܺο��� ������ ��� String
		String age = JOptionPane.showInputDialog("������ �Է��ϼ���");
		
		//JOptionPane.showMessageDialog(null, "����� �̸��� " + name);
		int age2 = Integer.parseInt(age);
		

		// ���ǹ�
		if (age2 >= 18) {
			JOptionPane.showMessageDialog(null,name + "���� �����̽ʴϴ�.");
		} else {
			JOptionPane.showMessageDialog(null,name + "���� �̼����̽ʴϴ�.");
		}
		
		

	}

}
