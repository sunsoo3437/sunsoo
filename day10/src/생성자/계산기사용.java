package ������;

import java.util.Date;

public class ������ {

	public static void main(String[] args) {
		���� cal = new ����();
		// �޼ҵ� �����ε��� ������ �Է°����� �Ѵ�.
		// Ÿ��, ����, ������ �߿�!
		int result1 = cal.add(100, 200);
		System.out.println(result1);
		double result2 = cal.add(100, 200.3);
		System.out.println(result2);
		double result3 = cal.add(100.1, 200.3);
		System.out.println(result3);
		String result4 = cal.add(100, "��");
		System.out.println(result4);
		String result5 = cal.add("���� ", "�ְ�!");
		System.out.println(result5);
		
		int[] result6 = cal.add();
		for (int i : result6) {
			System.out.println(i);
		}
		Date result7 = cal.add(2);
		System.out.println(result7.getHours());
	}

}
