package �迭����;

public class �迭�⺻ {

	public static void main(String[] args) {
		// 1. ���� ���� �����͸� �̹� �˰� �ִ� ���
		String[] food = {"���常","ġŲ","����"};
		//�迭�� �⺻������ ���� Ÿ�Ը� ����  �� �ִ�.
		food[0] = "������";
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (String x : food) {
			
		}
		
		// 2. ���� ���� �����͸� �𸣰� �ִ� ���
		String[] doing = new String[3];
		doing[0] = "ȸ����";
		doing[1] = "�Ҽ���";
		doing[2] = "���డ";
		for (int i = 0; i < doing.length; i++) {
			System.out.println(doing[i]);
		}
		for (String x : doing) {
			System.out.println(x);
		}
	}

}
