package inheritance;

public class B2 extends B3{
	int d=6;
	static int e=8; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 b1=new B3();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(c);
		B2 b2=new B2();
		System.out.println(b2.d);
		System.out.println(e);
		B3 b3=new B3();
		
		b3.note();
		
	}

}
