package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte n1 = 100;
		int n2 = n1;
		//큰<-작(자동으로 int로 변환되어 들어감)
		//타입변환(자동 형변환, 캐스팅)
		byte n3 = (byte)n2;
		//작<-큰(강제로 byte로 변환되어야 들어갈 수 있음)
		//타입변환(강제 형변환, 캐스팅, (바꾸고 싶은 타입)소괄호를 이용)
		System.out.println(n3);
		
		int n4 =2000;
		byte n5 = (byte)n4;
		//들어갈 수 없는 값의 범주에 강제캐스팅하는 경우에는 엉뚱한 값이 들어가므로 불가!
		System.out.println(n5);
	}

}
