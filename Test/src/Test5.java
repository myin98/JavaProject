import java.util.Scanner;

public class Test5{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		//입력한 시간에 -45
		
		if(m < 45) {
		 h--; 
		 m = 60 + (m - 45);
		 if(h < 0) {
			 	h =23;
		 
		 
		 }System.out.println(h + " " +  m);
		 
		}
		else {
			System.out.println(h + " " +  (m-45));
		}
		 
		

		 
		
		//sc.close();
	}
}