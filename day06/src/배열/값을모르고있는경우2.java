package 배열;

public class 값을모르고있는경우2 {

	public static void main(String[] args) {
		String[] name = new String[21];
		name[3] = "강선수";
		name[1] = "홍길동";
		name[5] = "박길동";
		name[8] = "김길동";
		name[12] = "송길동";
		name[19] = "이길동";
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + " : " +name[i]);
		}

	}

}
