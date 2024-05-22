
public class Star2 {

	public static void main(String[] args) {
		/***********************************************
		 * 문제2) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
     * ★
     * ★★
     * ★★★
     * ★★★★
     * ★★★★★
		 ************************************************/
		// 해결 코드 작성 시작
				String [][] 배열 = new String [5][5];
			    String 별 = "★";
			
			    
			    
			    
			    
			    
			
			    /*** 코드 시작 ***/
			    
			    for(int i = 0; i < 배열.length; i++) {
			    	
			    	for(int j = 0; j < 배열[i].length; j++ ){
			    		
			    		if(i >= j) {
			    			배열[i][j] = 별;
			    		} else (배열[i][j]) = " ";
			    		
			    		
			    		
			    		System.out.print(배열[i][j]);
			    	}
			    	System.out.println();
			    	
			    }
		
		
		
		
		
	}

}
