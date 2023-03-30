package nonprimitive;

public class Updown2 extends Updown1 {
	int e=2;
	int f=3;
	public static void main(String[] args) {
		Updown b1=new Updown();
		Updown1 b2=new Updown1();	
		Updown2 b3=new Updown2();
		/*b1=b3;
		System.out.println(b1.a);
		System.out.println(b1.b);
		Updown2 b4=(Updown2)b1;
		System.out.println(b4.a);
		System.out.println(b4.b);
		System.out.println(b4.e);
		System.out.println(b4.f);
		System.out.println(b4.c);
		System.out.println(b4.d);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());*/
		b1=b2;
		System.out.println(a);
		System.out.println(b1.b);
		Updown1 b5=(Updown1)b1;
		System.out.println(b5.a);
		System.out.println(b5.b);
		System.out.println(b5.c);
		System.out.println(b5.d);
		//System.out.println(b5.e);
		//System.out.println(b5.f);
		b2=b3;
		System.out.println(b2.c);
		System.out.println(b2.d);
		Updown2 b6=(Updown2)b2;
		System.out.println(b6.a);
		System.out.println(b6.b);
		System.out.println(b6.c);
		System.out.println(b6.d);
		System.out.println(b6.e);
		System.out.println(b6.f);
		b1=b3;
		System.out.println(b1.a);
		System.out.println(b1.b);
		Updown2 b4=(Updown2)b1;
		System.out.println(b4.a);
		System.out.println(b4.b);
		System.out.println(b4.e);
		System.out.println(b4.f);
		System.out.println(b4.c);
		System.out.println(b4.d);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
		
}
