package ��������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ����ȭ�� {

	public static void main(String[] args) {
		���� cal = new ����();
		JFrame f= new JFrame();
		f.setTitle("���� ����ȭ��");
//		JFrame f2 = new JFrame("���� ����ȭ��");
		f.setSize(700, 200);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton b1 = new JButton("���ϱ�");
		JButton b2 = new JButton("����");
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("����",Font.BOLD,100);
		b1.setFont(font);
		b2.setFont(font);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = cal.add(100, 200);
				JOptionPane.showMessageDialog(f, "���� ���� " + result);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = cal.minus(300, 20);
				JOptionPane.showMessageDialog(f, "�A ���� " + result);
			}
		});
		
		f.setVisible(true);
	}

}
