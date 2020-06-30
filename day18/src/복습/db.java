package 복습;

public class db {
// Data Access Object (DAO)
// - DB를 접근해서 처리하는 클래스
// 데이터를 가지고 할 수 있는 일
// Create, Read, Update, Delete (CRUD)
	
// Data Transfer Object (DTO)
// - 입력한 데이터를 DB에 전송하기 위해서 데이터를 묶기 위한 가방 역할의 클래스
	
	
	
	// 집에가서 할것
	// update bbs set content = ? where id = ?
	
	// -- 검색 (select)
	// select * from member

	// select id, pw from member

	// select tel from member where id = '100'

	// -- 추가 (insert)
	// insert into member values ('400', '400', 'Jung','018')

	// -- 대문자, ", ' : 사용가능
	// insert into member values ('500', '500', 'Lee', '019')

	// -- 수정 (update)
	// update member set tel = '999' where id = '100'

	// -- 탈퇴 (delete), 하나의 행을 삭제!
	// delete from member where id = '100'
}
