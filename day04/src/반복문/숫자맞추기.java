package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		//�ƹ����̳� ������ִ� ��ǰ�� �Ẹ��!
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;
		while(true) {
			String data = JOptionPane.showInputDialog("�����Է�");
			int guess = Integer.parseInt(data); // string�� ���ڸ� int��
			count++;
			if (target == guess) {
				System.out.println("�����Դϴ�.");
				System.out.println("����� �õ� Ƚ���� " + count + "ȸ");
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("������ �ƴմϴ�.");
				//�Է°��� ���亸�� ū�� ������ ��Ʈ�� �ּ���!
				if (target < guess) {
					System.out.println("������ �Է°����� �� �۽��ϴ�");
				} else {
					System.out.println("������ �Է°����� �� Ů�ϴ�");
				}
			}
		}
	}

}
