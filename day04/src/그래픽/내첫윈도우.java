package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ù������ {

	public static void main(String[] args) {
		// â ū�� �ѹ� �������.
		// ��ư ���� â���� �־��.
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b = new JButton();//��ư1������
		b.setText("���� ������");//��ư�� �ؽ�Ʈ
		b.setBackground(Color.yellow);//����
		b.setForeground(Color.blue);//���ڻ�
		f.add(b); // ��ư1���� â�� ����
		
		JButton b2 = new JButton();//��ư2������
		b2.setText("���� ������");//��ư�� �ؽ�Ʈ
		b2.setBackground(Color.DARK_GRAY);//����
		b2.setForeground(Color.pink);//���ڻ�
		f.add(b2); // ��ư 2���� â�� ����
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
				
		f.setVisible(true);//true�� ���̰� �ϸ鼭 �߰� ��. �⺻���� false
		//setVisible�� �� ���� ���� �����Ȱ��� ���̰� ����
		
		//JFrame a = new JFrame();
		//a.setSize(200, 800);
		//a.setVisible(true);
	}

}
