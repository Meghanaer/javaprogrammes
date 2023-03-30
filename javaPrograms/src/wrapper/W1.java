package wrapper;

public class W1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		char c='M';
		float f=10.2f;
		boolean e=true;
		System.out.println(a);
		//before JDK 1.5
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		System.out.println(b.floatValue());
		Character d=Character.valueOf(c);
		System.out.println(d);
		Float f1=Float.valueOf(f);
		System.out.println(f1);
		Boolean b1=Boolean.valueOf(e);
		System.out.println(b1);
		b=Integer.valueOf(50);
		System.out.println(b);
		b=Integer.valueOf(c);
		System.out.println(b);
		a=40;
		System.out.println(a);
		//after JDK 1.5
		Integer g=a;
		System.out.println(g);
		Character h=c;
		System.out.println(h);
		Float i=f;
		System.out.println(i);
		Boolean j=e;
		System.out.println(j);
		Integer k=60;
		System.out.println(k);
		Character l='M';
		System.out.println(l);
		
		
		

	}

}
