package nonprimitive;

public class Updown1 extends Updown {
	int c=13;
	int d=20;
public static void main(String[] args) {
	Updown a1=new Updown();
	Updown1 a2=new Updown1();
	System.out.println(a);
	
	a1=a2;
	System.out.println(a);
	System.out.println(a1.b);
	Updown1 a3=(Updown1)a1;
	System.out.println(a3.a);
	System.out.println(a3.b);
	System.out.println(a3.c);
	System.out.println(a3.d);
}
	}
