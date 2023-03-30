package interface1;

public class B1 implements B{
	public void Fest() {
		System.out.println("hlooo");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a1=new B1();
		a1.Fest();
		B.Rest();//static method so with help class name we have to call
		System.out.println(a);
		B1 a2=new B1();
		a2.Fest();
		System.out.println(a);
		
		

	}

}
