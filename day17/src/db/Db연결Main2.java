package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Dbø¨∞·Main2 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id");
		DAO dao = new DAO();
		dao.delete(id);
		
	}

}
