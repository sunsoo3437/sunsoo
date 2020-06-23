package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class 참조형형변환 {

	public static void main(String[] args) {
		//배열의 형변환은 없다.
		//클래스간, 클래스와 인터페이스간 가능
		//상속, 구현관계에서만 가능
		//자동차타이어(무늬,휠) <- 한국타이어,금호타이어
		//장난감타이어(무늬,휠) <- 형변환 불가
		//자동차타이어(큰)<- 한국타이어(작) / 자동형변환
		//자동차타이어(큰)-> 한국타이어(작) / 강제형변환
		//상속관계에선의 대소는 개념으로 구분!
		//자동차타이어가 더 큰 개념.
		
		//직원은 성인이면 된다.
		//성인<-남자성인18,여자성인18
		//아이, 상속관계가 아니기 때문에 직원으로 뽑을 수 없다.
		//f.add(Component c) <- 26개의 자식들이 다 들어올 수 있음
		//자동형변환,업캐스팅
		//강제형변환,다운캐스팅 : 소괄호를 사용해라!!
		
		ArrayList list= new ArrayList();
		//아무거나 다 들어가고, 크기도 조절가능
		//Object는 모든 클래스의 최상위 부모
		//업캐스팅되어 들어감.
		//부모자리로 맞춰놓으면, 그 아래에 있는 자시기나 후손이 부모자리에 다 들어갈 수 있다.
		//자동형변환
		list.add("고구마");
		list.add(100); //Integer(포장클래스,rapper class)
		//기본형--오토박싱-->포장클래스--업캐스팅-->Object(가장큼)
		
		//기본형---(포장, boxing)---> 포장클래스
		//기본형<---(포장x, unboxing)-- 포장클래스
		//자동박싱, 언박싱(auto boxing, unboxing)
		list.add(11.22); //Double
		list.add(true); //Boolean
		list.add(new JButton());
		list.add(new JLabel());
		
		Object food = list.get(0);//Object
		String food2 = (String)list.get(0);
		
	}

}
