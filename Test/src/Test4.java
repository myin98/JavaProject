
public class Test4 {

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i<5; i++) {
		 * 
		 * String 결과 = "";
		 * 
		 * if(i == 0) { 결과 = 별 + 별 + 별 + 별 + 별 ; } else if(i == 1) { 결과 = 별 + 별 + 별 + 별
		 * ; } else if (i == 2) { 결과 = 별 + 별 + 별 ; } else if (i == 3) { 결과 = 별 + 별 ; }
		 * else if (i == 4) { 결과 = 별 ; }
		 * 
		 * System.out.println(결과); }
		 */


		//배열[i][j] = 별;
		
//	    		if(i == 1 && j == 4) {
//	    				continue;
//	    		} else if (i == 2 && (j == 4 || j == 3)) {
//	    				continue;
//	    		} else if (i == 3 && (j == 4 || j == 3 || j == 2)) {
//	    				continue;
//	    		} else if (i == 4 && (j == 4 || j == 3 || j == 2 || j == 1)) {
//	    				continue;
//	    		}
		/***********************************************
		 * 문제1) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
     * ★★★★★
     * ★★★★
     * ★★★
     * ★★
     * ★
		 ************************************************/

		// 해결 코드 작성 시작
		String [][] 배열 = new String [5][5];
	    String 별 = "★";
	
	    
	    
	    
	    
	    
	
	    /*** 코드 시작 ***/
	    
	    for(int i = 0; i < 배열.length; i++) {
	    	
	    	for(int j = 0; j < 배열[i].length; j++ ){
	    		
	    		if(i <= j) {
	    			배열[i][j] = 별;
	    		} else (배열[i][j]) = "";
	    		
	    		
	    		
	    		System.out.print(배열[i][j]);
	    	}
	    	System.out.println();
	    	
	    }
	
	
	    /*** 코드 종료 ***/

		
		
		
	}

}
