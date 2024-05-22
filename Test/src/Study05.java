
public class Study05 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제7) [5행 5열] 2차원 배열을 이용하여
		 *  파스칼삼각형을 출력하는 프로그램 만들기
		 *  첫번째 행, 첫번째 열은 1로 시작으로 
		 *  두번째 행 부터 "바로 위 값"과 "바로위 왼쪽의 값"을 더한 값으로 출력 하세요.
		 * 출력 예시)        ┌───────────────────────처리 방법 예시───────────────────────┐
		 * 1				첫번째 열은 1로 시작
		 * 1, 1				1번 열은 (0,0)값, 2번 열은 (0,0)값
		 * 1, 2, 1			1번 열은 (1,0)값, 2번 열은 (1,1) + (1,0) 합값, 3번 열은 (1,1)값
		 * 1, 3, 3, 1
		 * 1, 4, 6, 4, 1
		 ************************************************/

		// 해결 코드 작성 시작
		int[][] 배열 = new int [5][5];
		
		int 초기값 = 1;
		배열[0][0] = 초기값;
		
		
		
		for(int i = 1; i < 배열.length; i++) {
			
			배열[i][0] = 초기값;
			
			for (int j = 1; j<배열[i].length; j++) {
				
				int 값 = (배열[i - 1][j] + 배열[i - 1][j - 1]);
				배열[i][j] = 값;
				
				
			}
			
			
		}
		
		for(int i = 0; i< 배열.length; i++) {
			for(int j = 0; j< 배열[i].length; j++) {
				if(배열[i][j] == 0) continue;
				System.out.print(배열[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
