
public class Study02 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제3) [3행, 3열] 문자열 2차원 배열를 생성 후 
		 *   인덱스 [0행 0열] 부터 [2행 2열] 까지 차례대로 출력하시오.
		 * 출력 예시)
		 * (0, 0)(0, 1)(0, 2)
		 * (1, 0)(1, 1)(1, 2)
		 * (2, 0)(2, 1)(2, 2)
		 ************************************************/

		// 해결 코드 작성 시작
		String[][] 배열 = new String [3][3];
		
		for(int i = 0; i< 배열.length; i++) {
			
			for(int j = 0; j<배열[1].length; j++) {
				String value = "(" + i + "," + j + ")";
						System.out.print(value);
			}
			System.out.println();
					
		}
		
		/*
		 * int 세로크기 = 배열.length;
		 * 
		 * int 가로크기 = 배열[0].length;
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 배열.length; i++) {
		 * 
		 * 배열[i][0] = 세로크기;
		 * 
		 * //System.out.println(세로크기);
		 * 
		 * }
		 * 
		 * for (int i = 0; i< 배열[0].length; i++) {
		 * 
		 * 배열[0][i] = 가로크기;
		 * 
		 * //System.out.println(가로크기); }
		 * 
		 * for (int i = 0; i< 배열[0][0]; i++) {
		 * 
		 * //System.out.println(배열[i][i]); }
		 */
		
		
	}

}
