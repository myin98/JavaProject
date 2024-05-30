package SqlTest;

public class App {

	private final static String URL = "jdbc:mariadb://localhost:3306/test";
	private final static String USER = "root";
	private final static String PASSWORD = "111222";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppController().시작(URL, USER, PASSWORD);
	}

}
