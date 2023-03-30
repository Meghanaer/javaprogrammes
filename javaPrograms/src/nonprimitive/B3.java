package nonprimitive;

public class B3 extends B1{
	int e=5;
	int f=6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1=new B1();
		B3 b3=new B3();
		System.out.println(b1 instanceof B1);
		b1=b3;
		System.out.println(b1.a);
		System.out.println(b1.b);
		B3 b4=(B3) b1;
		System.out.println(b4.a);
		System.out.println(b4.b);
		System.out.println(b4.e);
		System.out.println(b4.f);
		


	}

}
