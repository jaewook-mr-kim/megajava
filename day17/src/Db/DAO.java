package Db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAO {

	public void insert(String[] args) throws Exception {
		// 1. ����̹� (Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");
		// 2. db ���� (db��, id, pw) => (shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");
		// 3. sql�� ����

		
		// String sql = "insert into member values ('700', 'win', 'win', 'win')";
		// String sql = "delete from member where id = '700'";
		// SQL ������ ����ϴ� ��ü�� ������־�� �ڹٰ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL�� ���� ok....");
		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");
		
		// 1~3: google myBatis (apache iBatis ������)
		// �ڹٷ� ��Ʈ�������� ���� �� ���̹�Ƽ���� �����.
	}

}
