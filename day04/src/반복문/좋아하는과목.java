package �ݺ���;

import java.util.Scanner;

public class �����ϴ°��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ������ �Է��ϼ��� >>");
		String data = sc.next(); //�Ѵܾ ������(�����ν�) / ���� ������� nextline()
		switch (data) {
		case "java":
			System.out.println("JSP�� ����");
			break;
		case "python":
			System.out.println("���� ����");
			break;
		default:
			System.out.println("������ ������!!");
			break;
		}
	}

}
