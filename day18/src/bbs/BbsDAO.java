package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsDAO {

	public void create(String id, String title, String content, String writer) {
		try {
			
			// DBó��
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����....");
			// 2. DB ����
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����....");
		
			// 3. SQL �ۼ�
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL�ۼ� ����....");
			// 4. SQL ����
			ps.executeUpdate();
			System.out.println("4. SQL���� ����....");
			} catch (Exception e) {	
			}
			System.out.println("�Խù� db�� ����ó����.");
	}
	
	public void create(BbsDTO dto) {
		try {
			
			// DBó��
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����....");
			// 2. DB ����
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����....");
		
			// 3. SQL �ۼ�
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getWriter());
			System.out.println("3. SQL�ۼ� ����....");
			// 4. SQL ����
			ps.executeUpdate();
			System.out.println("4. SQL���� ����....");
			} catch (Exception e) {	
			}
			System.out.println("�Խù� db�� ����ó����.");
	}
	
	public void read() {
		System.out.println("�Խù� db�� �б�ó����.");
		String sql = "select * from bbs where id = ?";
		// �˻������ �׸��� 4���� ����.
		// 3, spring, fun spring, song
	}
	
	public void update() {
		System.out.println("�Խù� db�� ����ó����.");
	}
	
	public void delete(String id) {
		try {
			// DBó��
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����....");
			// 2. DB ����
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����....");
			// 3. SQL �ۼ�
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL�ۼ� ����....");
			
			// 4. SQL ����
			ps.executeUpdate();
			System.out.println("4. SQL���� ����....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�Խù� db�� ����ó����.");
	}
}
