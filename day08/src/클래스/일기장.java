package Ŭ����;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;

public class �ϱ��� {

	public static void main(String[] args) throws Exception {
		//�Է��� �޾ƺ���.
		String day = JOptionPane.showInputDialog("��¥�Է�");
		String title = JOptionPane.showInputDialog("�����Է�");
		String content = JOptionPane.showInputDialog("�����Է�");
		//��ġ�����ؼ� ����.
		//URL url = new URL(http://www.naver.com);
//		File file= new File("e:/imsi/0602.txt");
//		System.out.println("������ �ִ°�? " + file.exists());
		FileWriter file = new FileWriter(day + ".txt");
		file.write(day + "\n");
		file.write(title+ "\n");
		file.write(content+ "\n");
		file.close();
		//mvnrepository -- ��ǰ ����
	}

}
