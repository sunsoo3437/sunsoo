package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 봄여름 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 250);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton spring = new JButton(" 봄 ");
		JButton summer = new JButton("여름");
		
		f.add(spring);
		f.add(summer);
		
		Font font = new Font("맑은고딕", Font.BOLD, 100);
		spring.setFont(font);
		summer.setFont(font);
		
		spring.setBackground(Color.green);
		summer.setBackground(Color.blue);
		
		spring.setForeground(Color.yellow);
		summer.setForeground(Color.black);
		
		spring.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		summer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "너무 더워요");
				
			}
		});
		
		
		
		f.setVisible(true);
		

	}

}
