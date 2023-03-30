package inheritance;

public class A5 extends A4 {
static int c=3;
int d=4;

public static void main(String[] args) {
	A5 a5=new A5();
	System.out.println(c);
	System.out.println(a5.c);
	System.out.println(a5.d);
	System.out.println(a5.a);
	System.out.println(a5.b);
}
}