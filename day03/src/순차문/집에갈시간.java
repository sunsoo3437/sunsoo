package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class �������ð� {

	public static void main(String[] args) {
		//�ð��� �����ִ� Ŭ����
		//Date, Calendar
		Date date = new Date();
		int time = date.getHours();
		
		System.out.println("���� �ð��� "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		// ���ǹ�
		if (time >= 22) {
			JOptionPane.showMessageDialog(null,"���� �� �ð��� �� �ȳ��ұ���.");
		} else {
			JOptionPane.showMessageDialog(null,"���� �� �ð��� ���� ���ұ���.");
		}
	}
}
