package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ī���� {
	static int count = 0;

	public static void main(String[] args) {
		//��ü Ʋ ��ǰ ����
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//��ư 2�� ��ǰ ����
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");
		//�� 1�� ��ǰ ���� => �۾������� ���
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		
		Font font = new Font("�������", Font.BOLD, 200);
		Font font2 = new Font("�������", Font.BOLD, 100);
		number.setFont(font);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("- ��ư ����.");
				count--;
				System.out.println("count : " + count);
				number.setText(count+"");//�ڿ� ����־ ������ String���� ����
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("+ ��ư ����.");
				count++;
				System.out.println("count : " + count);
				number.setText(count+"");
			}
		});
		
		f.setVisible(true);
	}

}
