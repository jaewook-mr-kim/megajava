package 정리문제;

public interface DAOInterface {
	void create (String id, String pw);
	void read (String id);
	void update (String id, String pw);
	void delete (String id);
}
