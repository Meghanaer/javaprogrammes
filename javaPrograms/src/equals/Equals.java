package equals;

public class Equals {
	int a;
	public boolean equals(Object o) {
		Equals a1=(Equals) o;
		return a1.a==this.a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals a1=new Equals();
		a1.a=13;
		Equals a2=new Equals();
		a2.a=15;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a1));

	}

}
