package 클래스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범 {
	static int now = 2; //현재위치(시작위치)

	public static void main(String[] args) {
		String[] list = {"002.png","003.png","004.png","005.png","006.png"};
		String[] tlist = {"언더워터","프리즌이스케이프","위대한쇼맨","카페밸에포크","미스비헤이비어"};
		
		//변수는 만들어진 위치가 중요!
		//선언의 위치가 변수가 살 수 있는 범위
		
		//부품 가져오기
		JFrame f = new JFrame();
		JLabel top = new JLabel();
		JLabel title = new JLabel();
		JButton left = new JButton("←←←←");
		JButton right = new JButton("→→→→");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//조립
		f.setSize(300, 500);
		f.add(title);
		f.add(top);
		f.add(left);
		f.add(right);
		
		ImageIcon icon = new ImageIcon(list[now]);
		title.setText(tlist[now]);
		top.setIcon(icon);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (now > 0) {
					now--;
				} else {
					now = 4;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				title.setText(tlist[now]);
				top.setIcon(icon);
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (now < 4) {
					now++;
				} else {
					now = 0;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				title.setText(tlist[now]);
				top.setIcon(icon);
			}
		});
		
		Font font = new Font("맑은 고딕",Font.BOLD, 15);
		Font fonta = new Font("맑은 고딕",Font.BOLD, 40);
		title.setFont(fonta);
		left.setFont(font);
		right.setFont(font);
		left.setBackground(Color.yellow);
		right.setBackground(Color.yellow);
		left.setForeground(Color.black);
		right.setForeground(Color.blue);
		
		f.setVisible(true);
	}

}
