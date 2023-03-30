package superkeyword;

public class A2 extends A1{
	int c=3;
	int d=4;
	
	A2(){
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(this.c);
		System.out.println(this.d);
		super.add();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a1=new A2();
	    a1.add();
		

	}

}
