package �迭;

public class �����ƴ°�� {
	int win = 0;//��������(global)
	
	public static void main(String[] args) {
		//���� ������ ����� �ñ� : �ش� ���� ����Ǵ� �ñ⿡(����!)
		//������ ��ġ�� ������ ����!!!
		//�Լ����� ���������� ������ �� �ִ� ���� : ��������
		//���� = local
		String[] names = {"������", "��Ÿ��", "������"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("");
		
		for (String x : names) {//for (���������� ������ : �迭��) = foreach
			System.out.print(x + " ");
		}
		System.out.println("");
		
		char[] gender = {'��','��','��'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println("");
		for (char x : gender) {//for (���������� ������ : �迭��)
			System.out.print(x + " ");
		}
		System.out.println("");
		
		int[] ages = {60, 54, 29};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println("");
		for (int x : ages) {//for (���������� ������ : �迭��)
			System.out.print(x + " ");
		}
		System.out.println("");
		
		double[] height = {170.2, 157.8, 174};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println("");
		for (double x : height) {//for (���������� ������ : �迭��)
			System.out.print(x + " ");
		}
	}

}
