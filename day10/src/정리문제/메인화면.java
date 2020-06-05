package 정리문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 메인화면 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		JFrame f= new JFrame();
		f.setTitle("나의 메인화면");
//		JFrame f2 = new JFrame("나의 메인화면");
		f.setSize(700, 200);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton b1 = new JButton("더하기");
		JButton b2 = new JButton("빼기");
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("굴림",Font.BOLD,100);
		b1.setFont(font);
		b2.setFont(font);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = cal.add(100, 200);
				JOptionPane.showMessageDialog(f, "더한 값은 " + result);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = cal.minus(300, 20);
				JOptionPane.showMessageDialog(f, "뺸 값은 " + result);
			}
		});
		
		f.setVisible(true);
	}

}
