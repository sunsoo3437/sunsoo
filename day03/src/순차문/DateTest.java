package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		//�� �� �� ���� �� �� �� 
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1 ;
		int daily = date.getDate();
		int day = date.getDay();
		//JOptionPane.showMessageDialog(null, year + "�� " + month + "�� " + daily + "��");
		System.out.println(day);
		if (day == 0 || day == 6) {//�Ͽ��� or �����
			System.out.println("��ſ� �ָ�");
		} else if (day == 1) {//��
			System.out.println("���亴 ������ ��ٳ�");
		} else if (day == 2 || day == 4) {//ȭ or ��
			System.out.println("�ڹ� ���� ������");
		} else {
			
		}
		
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		//JOptionPane.showMessageDialog(null, hour + "�� " + min + "�� " + sec + "��");
		
	}

}
