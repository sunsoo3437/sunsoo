package 클래스;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;

public class 일기장 {

	public static void main(String[] args) throws Exception {
		//입력을 받아보자.
		String day = JOptionPane.showInputDialog("날짜입력");
		String title = JOptionPane.showInputDialog("제목입력");
		String content = JOptionPane.showInputDialog("내용입력");
		//위치지정해서 저장.
		//URL url = new URL(http://www.naver.com);
//		File file= new File("e:/imsi/0602.txt");
//		System.out.println("파일이 있는가? " + file.exists());
		FileWriter file = new FileWriter(day + ".txt");
		file.write(day + "\n");
		file.write(title+ "\n");
		file.write(content+ "\n");
		file.close();
		//mvnrepository -- 부품 저장
	}

}
