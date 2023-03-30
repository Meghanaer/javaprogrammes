package nonprimitive;

public class A3 extends A2{
	int e=55;
	int f=13;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1=new A2();
		System.out.println(a1.a);
		System.out.println(a1.b);
		A2 a2=(A2) a1;
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);
		System.out.println(a2.d);
		A1 a3=new A3();
		System.out.println(a3.a);
		System.out.println(a3.b);
		A3 a4=(A3) a3;
		System.out.println(a4.a);
		System.out.println(a4.b);
		System.out.println(a4.c);
		System.out.println(a4.d);
		System.out.println(a4.e);
		System.out.println(a4.f);
		A2 a5=new A3();
		System.out.println(a5.c);
		System.out.println(a5.d);
		A3 a6=(A3) a5;
		System.out.println(a6.a);
		System.out.println(a6.b);
		System.out.println(a6.c);
		System.out.println(a6.d);
		System.out.println(a6.e);
		System.out.println(a6.f);
		

	}

}
