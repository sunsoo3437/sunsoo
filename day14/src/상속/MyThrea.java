package ���;

public class MyThrea {

	public static void main(String[] args) {
		Star star = new Star();
		Dia dia = new Dia();
		//���ÿ� �����϶�� cpu�� �˷���� �Ѵ�.
		star.start();
		dia.start();
	}

}
