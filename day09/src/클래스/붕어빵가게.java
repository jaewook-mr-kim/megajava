package Å¬·¡½º;

public class ºØ¾î»§°¡°Ô {

	public static void main(String[] args) {
		// ºØ¾î»§Æ² : class
		// ºØ¾î»§ : object, classÀÇ instance
		// new´Â °´Ã¼¸¦ »ý¼ºÇÒ ¶§ »ç¿ë
		
		ºØ¾î»§Æ² ºØ¾î»§1 = new ºØ¾î»§Æ²();
		ºØ¾î»§Æ² ºØ¾î»§2 = new ºØ¾î»§Æ²();
		
		ºØ¾î»§1.shape = "ºØ¾î";
		ºØ¾î»§1.source = "ÆÏ";
		
		ºØ¾î»§1.»ç´Ù(); // " . " Á¢±Ù ¿¬»êÀÚ 
		ºØ¾î»§1.¸Ô´Ù();
		
		System.out.println(ºØ¾î»§1.shape);
		System.out.println(ºØ¾î»§1.source);
	}

}
