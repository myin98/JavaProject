
public class Study17 {

	static int a = 0;
	static int c = 0;
	
	public static void main(String[] args) {
		//전역과 지역은 나누어진다
		
		
		System.out.println(a);
		int c =b();
		System.out.println(c);

	}
	
	static int b() {
		int c = 5;
		//this.c = c ;
		System.out.println(a);
		return c;
	}

}
