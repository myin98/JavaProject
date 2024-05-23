import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class calcu {

	public static void main(String[] args) {
		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		//boolean key = false;
		
		/** 객체 사용 **/
		
	while(true) {
		
		System.out.println("1 ~ 4 정수를 입력하시오");
		System.out.println("1 : 더하기, 2 : 빼기, 3 : 곱하기, 4 : 나누기");
		
		int a = sc.nextInt();
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int c = sc.nextInt();
		
//		if(a == 1) {
//			System.out.println(b + c);
//			
//			
//		} else if(a == 2) {
//			System.out.println(b - c);
//		} else if(a == 3) {
//			System.out.println(b * c);
//		} else if(a == 4) {
//			System.out.println(b / c);
//		} 
		
		int 값 = 0;		
		
		switch (a) {
		case 1: 값 = (b + c);
		case 2: 값 = (b - c);
		case 3: 값 = (b * c);
		case 4: 값 = (b / c);
			break;
		default : 	
			
		
			//key = true;
		}
		//if(key) break;
		
		
		System.out.println(값);
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		/** 객체 제거 **/
		//sc.close();
		

	}

}
