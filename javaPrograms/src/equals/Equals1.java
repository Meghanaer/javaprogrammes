package equals;

public class Equals1 {
	String s;
	public boolean equals(Object o) {
		Equals1 a1=(Equals1) o;
		return a1.s==this.s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals1 a1=new Equals1();
		a1.s="meghs";
		Equals1 a2=new Equals1();
		a2.s="meghu";
		Equals1 a3=new Equals1();
		a3.s="meghs";
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a2.equals(a3));

	}

}
