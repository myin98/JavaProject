
public class Study00 {

	public static void main(String[] args) {
		
		
		
		/*
		 * //1차원 배열 (행) [행, 세로] //0 = 0 <<-----배열[0] = ? //1 //2 //3
		 * 
		 * int[] 배열 = new int[10];
		 * 
		 * int 크기 = 배열.length; System.out.println(크기);
		 * 
		 * 배열[0] = 100; // 0 ~ 9 System.out.println(배열[0]);
		 * 
		 * 배열[1] = 99; System.out.println(배열[1]);
		 */
		
		
		//2차원 배열 [행][열]
		// [행0][열0] ,[행0][열1]
		// [행1][열0]
		// [행2][열0] ,[행2][열1] ,[행2][열2]
		// [행3][열0]
		// [행4][열0]
		
		
		
		/***********************************************
		 * 문제2) 배열 크기가 10이고 초기의값의 아래와 같다.
		 *      연산할 값은 9로 고정으로 사용하여 배열에 빼기 연산으로
		 *      다시 넣으시오.
		 * 출력 예시)
		 * 인덱스		초기값	연산할값		배열에들어갈 값
		 * 0		9		9			(9 - 9)
		 * 1		8		9			(8 - 9)
		 * 2		7		9			(7 - 9)
		 * 3		6		9			(6 - 9)
		 * 4		5		9			(5 - 9)
		 * 5		4		9			(4 - 9)
		 * 6		3		9			(3 - 9)
		 * 7		2		9			(2 - 9)
		 * 8		1		9			(1 - 9)
		 * 9		0		9			(0 - 9)
		 ************************************************/
	int[] 배열 = new int[10];
	int 변수 = 9;
	
	for (int i = 0; i < 배열.length; i++) {
		배열[i] = 변수;
		변수--;
		//System.out.println(i);
	}
	
	변수 = 9;
	for(int i = 0; i < 배열.length; i++) {
		
		int 값 = (배열[i] - 변수);
		배열[i] = 값;
		
		//System.out.println(값);
	}

	for(int i = 0; i < 배열.length; i++) {
		System.out.println(배열[i]);
	}
		
		
		
		
		
	}

}
