package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DAO {

	public void insert (String id, String pw, String name, String tel) throws Exception {
		//1~3 : google myBatis - �������� ���� ���� �����
		//             ���̹�Ƽ��
		//1. ����̹�(Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");
		
		//2. db ����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok.....");
		
		//3. sql�� ����
		String sql = "insert into member values (?,?,?,?)";
		//sql���� ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);//�����ϰ� �迭 �� ó�� ��ȣ�� 1��
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql�� ���� ok....");
			
		//4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. sql�� ���� ok....");
		ps.close();
		con.close();
	}
	public void delete (String id) throws Exception {
		//1~3 : google myBatis - �������� ���� ���� �����
		//             ���̹�Ƽ��
		//1. ����̹�(Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");
		
		//2. db ����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok.....");
		
		//3. sql�� ����
		
		String sql = "delete from member where id = ?";
		//sql���� ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);//�����ϰ� �迭 �� ó�� ��ȣ�� 1��
		System.out.println("3. sql�� ���� ok....");
				
		//4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. sql�� ���� ok....");
		ps.close();
		con.close();
	}

}
