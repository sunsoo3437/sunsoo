package 반복문;

import java.util.Scanner;

public class 콘솔바로입력 {

	public static void main(String[] args) {
		//Scanner 스캐너(입력용  - file, 키보드, 네트워크 등등)
		//String --> int 명령어를 가지고 있음.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >>");
		int age = sc.nextInt();//
		System.out.println("당신의 나이는 " + age);
		System.out.println("당신의 내년 나이는 " + (age +1));
	}
	
}
