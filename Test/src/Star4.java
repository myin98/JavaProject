
public class Star4 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제4) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
     *     ★
     *    ★★
     *   ★★★
     *  ★★★★
     * ★★★★★
		 ************************************************/
//		String [][] 배열 = new String [5][5];
//	    String 별 = "★";
//	
//	    
//	    
//	    
//	    
//	    
//	
//	    /*** 코드 시작 ***/
//	    
//	    for(int i = 0; i < 배열.length; i++) {
//	    	
//	    	for(int j = 0; j < 배열[i].length; j++ ){
//	    		
//	    		if(i >= j ) {
//	    			배열[i][j] = 별;
//	    		} else (배열[i][j]) = " ";
//	    		
//	    		
//	    		
//	    		System.out.print(배열[i][j]);
//	    	}
//	    	System.out.println();
//	    	
//	    }
	    String 별 = "★";
		
	    /*** 코드 시작 ***/
	    String[][] 배열 = new String[5][5];
	    
	    for(int i = 0; i < 배열.length; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		String 빈공간 = " ";
	    		if(i == 0 && j >= 4) {
	    			배열[i][j] = 별;
	    		} else if(i == 1 && j >= 3) {
	    			배열[i][j] = 별;
	    		} else if(i == 2 && j >= 2) {
	    			배열[i][j] = 별;
	    		} else if(i == 3 && j >= 1) {
	    			배열[i][j] = 별;
	    		} else if(i == 4 && j >= 0) {
	    			배열[i][j] = 별;
	    		} else {
	    			배열[i][j] = 빈공간;
	    		}
	    	}
	    }
	    
	    
	
	    for(int i = 0; i < 배열.length; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		System.out.print(배열[i][j]);
	    	}
	    	System.out.println();
	    }
	
	    /*** 코드 종료 ***/

		
		
		
		
		
	}

}
