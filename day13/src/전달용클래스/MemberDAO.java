package 전달용클래스;

public class MemberDAO { // DAO : data access object (db처리 전담 클래스)
	// db에 넣는 처리를 구현
	public void insert(MemberDTO bag) {
		System.out.println("db에 접속함.");
		System.out.println("저장된 id: " + bag.getId());
		System.out.println("저장된 pw: " + bag.getPw());
		System.out.println("저장된 name: " + bag.getName());
		System.out.println("저장된 tel: " + bag.getTel());
		System.out.println("db에 저장함.");
	}

}
