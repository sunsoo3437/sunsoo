package ������;

import javax.swing.JOptionPane;

public class ���̹��α��� {

	public static void main(String[] args) {
		String id = "root";//������������ id
		String id2 = JOptionPane.showInputDialog("id�� �Է��ϼ���.");
		
		String pw = "1111";
		String pw2 = JOptionPane.showInputDialog("pw�� �Է��ϼ���.");
		
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}

}
