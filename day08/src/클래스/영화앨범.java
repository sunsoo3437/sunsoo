package Ŭ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ��ȭ�ٹ� {
	static int now = 2; //������ġ(������ġ)

	public static void main(String[] args) {
		String[] list = {"002.png","003.png","004.png","005.png","006.png"};
		String[] tlist = {"�������","�������̽�������","�����Ѽ��","ī��뿡��ũ","�̽������̺��"};
		
		//������ ������� ��ġ�� �߿�!
		//������ ��ġ�� ������ �� �� �ִ� ����
		
		//��ǰ ��������
		JFrame f = new JFrame();
		JLabel top = new JLabel();
		JLabel title = new JLabel();
		JButton left = new JButton("�����");
		JButton right = new JButton("�����");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//����
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
		
		Font font = new Font("���� ���",Font.BOLD, 15);
		Font fonta = new Font("���� ���",Font.BOLD, 40);
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
