package �ݺ���;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		int count = 10; // ���۰�
		while (count <= 15) { //���ǽ�
			System.out.println(count  + " ���ѷ����� ��������!");
			count = count + 1; // count++(1�� ����!) ����������	
		}
		
		System.out.println("------------------------------");
		
		for (int i = 10; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		while (true) {
			// cpu�� ������ġ�� ���������� ���� �Ұ�.
			// cpu�� ó���� ��� ������, ���α׷��� RAM�� ������ ���� �����.
			// ���� ���� �͵��� �̹� RAM�� �־�� ����
			// =>�빮�ڷ� �Ἥ �ٷ� ��� ����
			String hour = JOptionPane.showInputDialog("���� ����Դϱ�(����x)"); //.���ٿ�����
			//x �������� Ȯ���ؾ���.
			//x ��������, �ݺ��� ������ ó��
			if (hour.equals("x")) {
				System.out.println("�ý����� �����մϴ�.");
				break;//�ڽ��� �����ϰ� �ִ� �ݺ����� �����ش�.
			}
			System.out.println(hour + "�� �Դϴ�.");//���տ�����(String �ϳ��� ������)
		}
			
	}

}
