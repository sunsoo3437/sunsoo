package 반복문;

import java.util.Scanner;

public class 좋아하는과목 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 과목을 입력하세요 >>");
		String data = sc.next(); //한단어만 가져옴(공백인식) / 한줄 땡기려면 nextline()
		switch (data) {
		case "java":
			System.out.println("JSP로 점프");
			break;
		case "python":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히!!");
			break;
		}
	}

}
