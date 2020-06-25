package Db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAO {

	public void insert(String[] args) throws Exception {
		// 1. 드라이버 (커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");
		// 2. db 연결 (db명, id, pw) => (shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");
		// 3. sql문 생성

		
		// String sql = "insert into member values ('700', 'win', 'win', 'win')";
		// String sql = "delete from member where id = '700'";
		// SQL 문장을 담당하는 객체로 만들어주어야 자바가 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 생성 ok....");
		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok....");
		
		// 1~3: google myBatis (apache iBatis 였었음)
		// 자바로 포트폴리오로 만들 때 마이바티스를 써야함.
	}

}
