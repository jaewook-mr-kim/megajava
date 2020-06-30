package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsDAO {

	public void create(String id, String title, String content, String writer) {
		try {
			
			// DB처리
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....");
			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
		
			// 3. SQL 작성
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL작성 성공....");
			// 4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL전달 성공....");
			} catch (Exception e) {	
			}
			System.out.println("게시물 db에 저장처리됨.");
	}
	
	public void create(BbsDTO dto) {
		try {
			
			// DB처리
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....");
			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
		
			// 3. SQL 작성
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getWriter());
			System.out.println("3. SQL작성 성공....");
			// 4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL전달 성공....");
			} catch (Exception e) {	
			}
			System.out.println("게시물 db에 저장처리됨.");
	}
	
	public void read() {
		System.out.println("게시물 db에 읽기처리됨.");
		String sql = "select * from bbs where id = ?";
		// 검색결과의 항목은 4개일 것임.
		// 3, spring, fun spring, song
	}
	
	public void update() {
		System.out.println("게시물 db에 수정처리됨.");
	}
	
	public void delete(String id) {
		try {
			// DB처리
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....");
			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
			// 3. SQL 작성
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL작성 성공....");
			
			// 4. SQL 전달
			ps.executeUpdate();
			System.out.println("4. SQL전달 성공....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("게시물 db에 삭제처리됨.");
	}
}
