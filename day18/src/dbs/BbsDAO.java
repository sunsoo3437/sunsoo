package dbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	
	public void create(BbsBag bag) {
		try {
			System.out.println("게시물 db에 저장처리됨");
			//DB처리
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			//2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db 연결 성공");
			
			//3. SQL 작성
			String sql = "insert into dbs values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. SQL 작성 완료");
			
			//4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL 전달 완료");
		} catch (Exception e) {
			
		}
		
	}
	public BbsBag read(String id) {
		BbsBag bag = null;
		try {
			System.out.println("게시물 db에 읽기처리됨");
			//DB처리
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			//2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db 연결 성공");
			
			//3. SQL 작성
			String sql = "select * from dbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL 작성 완료");
			
			//4. SQL 전달 후 검색 결과를 UI로 가지고 와야함
			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL 전달 완료");
			if (rs.next()) {//결과값 있으면 true
				bag = new BbsBag();
				String id2 = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}
		} catch (Exception e) {
			
		}
		return bag;
	}
	public void update(BbsBag bag) {
		System.out.println("게시물 db에 수정처리됨");
		try {
			System.out.println("게시물 db에 삭제처리됨");
			//DB처리
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			//2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db 연결 성공");
			
			//3. SQL 작성
			String sql = "update dbs set content = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL 작성 완료");
			
			//4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL 전달 완료");
		} catch (Exception e) {
			
		}
	}
	public void delete(BbsBag bag) {
		try {
			System.out.println("게시물 db에 삭제처리됨");
			//DB처리
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			//2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db 연결 성공");
			
			//3. SQL 작성
			String sql = "delete from dbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. SQL 작성 완료");
			
			//4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL 전달 완료");
		} catch (Exception e) {
			
		}
	}
	
}
