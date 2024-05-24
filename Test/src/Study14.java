
public class Study14 {

	public static void main(String[] args) {
		//기본 메소드 활용법
		
	int 합	=  합(1,2);  // 3
	System.out.println(합);	
	int 빼기 = 빼기(5,1); // 4
	System.out.println(빼기);	
	int 곱하기 = 곱하기(5,1); // 5
	System.out.println(곱하기);	
	int 나누기 = 나누기(18,3);  // 6
	System.out.println(나누기);	
	
	
	
	
	}

	static int 합(int a , int b) {
		return( a + b);
	}
	
	static int 빼기(int a , int b) {
		return (a - b);
	}
	
	static int 곱하기(int a , int b) {
		return (a * b);
	}
	
	static int 나누기(int a , int b) {
		return (a / b);
	}

}
