package methodoveriding;

public class A4 extends A3{
	void test() {
		int oddcount=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				oddcount++;
			}
		}
		System.out.println(oddcount); 
		System.out.println(1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a4=new A4();
		a4.test();
		
		
		

	}

}
