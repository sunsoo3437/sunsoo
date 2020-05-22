package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ���� {
static double num = 0;
// ���� - �μ� ����, �ϳ��� double�̸� ������� ������ double

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,300);
		
		JLabel img= new JLabel();
		f.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		JLabel n1 = new JLabel("����1");
		JLabel n2 = new JLabel("����2");
		
		JTextField t1 = new JTextField(6);
		JTextField t2 = new JTextField(6);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton times = new JButton("*");
		JButton divide = new JButton("/");
		
		JLabel result = new JLabel("0");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("���� ���", Font.BOLD, 50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		times.setFont(font);
		divide.setFont(font);
		result.setFont(font);
		
		f.add(n1);
		f.add(t1);
		f.add(n2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(times);
		f.add(divide);
		f.add(result);
		
		t1.setBackground(Color.black);
		t2.setBackground(Color.black);
		plus.setBackground(Color.blue);
		plus.setForeground(Color.pink);
		minus.setBackground(Color.blue);
		minus.setForeground(Color.pink);
		times.setBackground(Color.blue);
		times.setForeground(Color.pink);
		divide.setBackground(Color.blue);
		divide.setForeground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		result.setBackground(Color.white);
		result.setForeground(Color.black);
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;���.
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11= Integer.parseInt(num1);
				double num22= Integer.parseInt(num2);
				num = num11 + num22;
				// ���ؼ� ����غ��ô�.
				result.setText(num+"");
			}
		});		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;���.
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11= Integer.parseInt(num1);
				double num22= Integer.parseInt(num2);
				num = num11 - num22;
				// ���� ����غ��ô�.
				result.setText(num+"");
				
			}
		});		
		times.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;���.
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11= Integer.parseInt(num1);
				double num22= Integer.parseInt(num2);
				num = num11 * num22;
				// ���ؼ� ����غ��ô�.
				result.setText(num+"");
				
			}
		});		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;���.
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11= Integer.parseInt(num1);
				double num22= Integer.parseInt(num2);
				num = num11 / num22;
				// ������ ����غ��ô�.
				result.setText(num+"");
				
			}
		});		
		
		f.setVisible(true);

	}

}
