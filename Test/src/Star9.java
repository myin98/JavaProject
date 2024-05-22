
public class Star9 {

	public static void main(String[] args) {
		/***********************************************
		 * 문제9) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *    ★
	     *   ★★★
	     *  ★★★★★
	     * ★★★★★★★
	     *  ★★★★★
	     *   ★★★
	     *    ★
		 ************************************************/

		String 별 = "★";
		 String[][] 배열 = new String[7][7];
		
		  
		    for(int i = 0; i < 배열.length; i++) {
		    	for(int j = 0; j < 배열[i].length; j++) {
		    		String 빈공간 = " ";
		    		  if(i == 0 && j == 3)     {
		    			배열[i][j] = 별 ;
		    		}  else if(i == 1 && j >=2 && j <=4 && i <= j) {
		    			배열[i][j] = 별 ;
		    		}  else if(i == 2 && j >=1 && j <=5) {
		    			배열[i][j] = 별 ;
		    		}  else if(i == 3) {
		    			배열[i][j] = 별 ;
		    		}  else if(i == 4 && j >=1 && j <=5) {
		    			배열[i][j] = 별 ;
		    		}  else if(i == 5 && j >=2 && j <=4) {
		    			배열[i][j] = 별 ;
		    		}   else if(i == 6 && j == 3) {
		    			배열[i][j] = 별 ;
		    		}
		    		
		    		else {
		    			
		    			배열[i][j] = 빈공간;
		    		}
		    		
		    		
		    		
		    		System.out.print(배열[i][j]);
		    	}System.out.println();
		    }
		
		
		
		
		
		
	}

}
