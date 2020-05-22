package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {
	static int count = 0;

	public static void main(String[] args) {
		//전체 틀 부품 복사
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//버튼 2개 부품 복사
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");
		//라벨 1개 부품 복사 => 글씨넣을때 사용
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		
		Font font = new Font("맑은고딕", Font.BOLD, 200);
		Font font2 = new Font("맑은고딕", Font.BOLD, 100);
		number.setFont(font);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("- 버튼 누름.");
				count--;
				System.out.println("count : " + count);
				number.setText(count+"");//뒤에 공백넣어서 강제로 String으로 만듬
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("+ 버튼 누름.");
				count++;
				System.out.println("count : " + count);
				number.setText(count+"");
			}
		});
		
		f.setVisible(true);
	}

}
