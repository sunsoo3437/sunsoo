package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 250);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton spring = new JButton(" �� ");
		JButton summer = new JButton("����");
		
		f.add(spring);
		f.add(summer);
		
		Font font = new Font("�������", Font.BOLD, 100);
		spring.setFont(font);
		summer.setFont(font);
		
		spring.setBackground(Color.green);
		summer.setBackground(Color.blue);
		
		spring.setForeground(Color.yellow);
		summer.setForeground(Color.black);
		
		spring.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�����ؿ�");
			}
		});
		summer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�ʹ� ������");
				
			}
		});
		
		
		
		f.setVisible(true);
		

	}

}
