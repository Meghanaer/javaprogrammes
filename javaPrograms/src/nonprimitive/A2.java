package nonprimitive;

public class A2 extends A1 {
	int c=5;
	int d=6;
	public static void main(String[] args) {
		A1 a1=new A2();
		System.out.println(a1.a);
		System.out.println(a1.b);
		A2 a2=(A2) a1;
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);
		System.out.println(a2.d);
		
	}

}
