package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		// 창 큰거 한번 띄워보자.
		// 버튼 만들어서 창에서 넣어보자.
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b = new JButton();//버튼1번생성
		b.setText("나를 눌러요");//버튼의 텍스트
		b.setBackground(Color.yellow);//배경색
		b.setForeground(Color.blue);//글자색
		f.add(b); // 버튼1번을 창에 넣음
		
		JButton b2 = new JButton();//버튼2번생성
		b2.setText("나도 눌러요");//버튼의 텍스트
		b2.setBackground(Color.DARK_GRAY);//배경색
		b2.setForeground(Color.pink);//글자색
		f.add(b2); // 버튼 2번을 창에 넣음
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
				
		f.setVisible(true);//true면 보이게 하면서 뜨게 됨. 기본값은 false
		//setVisible은 이 문구 위에 설정된것을 보이게 해중
		
		//JFrame a = new JFrame();
		//a.setSize(200, 800);
		//a.setVisible(true);
	}

}
