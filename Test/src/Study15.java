
public class Study15 {
	
	static int b = 0;

	public static void main(String[] args) {
			a();

	}
	
	static void a() {
		
		
		if(b < 5) {
			System.out.println("안녕" + b);
			b++;
			a();
			
		}
		
	}
	

}
