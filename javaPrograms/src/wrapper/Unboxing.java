package wrapper;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=20;
		int b=a.intValue();
		System.out.println(b);
		Character c='M';
		char ch=c.charValue();
		System.out.println(ch);
		Boolean d=true;
		boolean e=d.booleanValue();
		System.out.println(e);
		int f=a;
		System.out.println(f);

	}

}
