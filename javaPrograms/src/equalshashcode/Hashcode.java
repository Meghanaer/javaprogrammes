package equalshashcode;

public class Hashcode {
	int a;
	public boolean equals(Object o) {
		Hashcode h1=(Hashcode)o;
		return this.a==h1.a;
	}
	public int hashcode() {
		return this.a+5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashcode h1=new Hashcode();
		h1.a=30;
		Hashcode h2=new Hashcode();
		h2.a=30;
		Hashcode h3=new Hashcode();
		h3.a=50;
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		System.out.println(h3.equals(h2));
		System.out.println(h1.hashcode());
		System.out.println(h2.hashcode());
		System.err.println(h3.hashcode());
		}

	}


