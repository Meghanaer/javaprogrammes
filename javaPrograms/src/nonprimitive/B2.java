package nonprimitive;

public class B2 extends B1{
	int c=3;
	int d=4;
	public static void main(String[] args) {
	B1 b1=new B1();
	B2 b2=new B2();
	System.out.println(b1 instanceof B1);
	b1=b2;
	System.out.println(b1.a);
	System.out.println(b1.b);
	B2 b3=(B2) b1;
	System.out.println(b3.a);
	System.out.println(b3.b);
	System.out.println(b3.c);
	System.out.println(b3.d);
	
	}
}
