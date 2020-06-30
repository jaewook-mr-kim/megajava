package bbs;

import javax.swing.JOptionPane;

public class Dbø¨∞·Main {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("id");
		String title = JOptionPane.showInputDialog("title");
		String content = JOptionPane.showInputDialog("content");
		String writer = JOptionPane.showInputDialog("writer");
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO();
		
		dto.setId(id);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setWriter(writer);
		
		dao.create(dto);
	}

}
