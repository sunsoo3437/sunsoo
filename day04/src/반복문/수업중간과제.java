package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class �����߰����� {
	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;//alt + shift + z = ���ÿ��� whlie ������ ����
		while (true) {
			String input = JOptionPane.showInputDialog("x�� �Է½�, ����˴ϴ�.");
			if (input.equals("x")) {
				System.out.println("�����մϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "ȸ �ݺ�");
				break;
			}
			count++;
			int dataa = r.nextInt(100);
			int datab = r.nextInt(100);
			System.out.println(dataa);
			System.out.println(datab);
			if (dataa > datab) {
				System.out.println("�� ���� �տ� �ִ� ���ڰ� �� Ŀ��");
			} else if (dataa < datab){
				System.out.println("�� ���� �տ� �ִ� ���ڰ� �� �۾ƿ�");
			} else {
				System.out.println("�� ���� �����ϴ�.");
			}
			
		}
	}
}
