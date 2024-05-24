
public class Study18_1 {

	 int a;
	
	Study18_1(){
		System.out.println(111111);
	}
	
	Study18_1(int a){
		System.out.println(2);
		this.a = a;
	}
	
	void b() {
		System.out.println(this.a);
	}
	
	
}
