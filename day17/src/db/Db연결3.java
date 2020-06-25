package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Db연결3 {

	public static void main(String[] args) throws Exception {
		//1~3 : google myBatis - 현업에서 가장 많이 사용함
		//             마이바티스
		//1. 드라이버(커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");
		
		//2. db 연결(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok.....");
		
		//3. sql문 생성
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		String sql = "insert into member values (?,?,?,?)";
//		String sql = "delete from member where id = '700'";
		//sql문장 담당하는 객체로 만들어주어야 자바는 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);//유일하게 배열 맨 처음 번호가 1번
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. sql문 생성 ok....");
		
		
		//4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 ok....");
	}

}
