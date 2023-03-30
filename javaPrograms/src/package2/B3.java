package package2;
import package1.B1;
public class B3 extends B1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 a1=new B3();
		a1.best();
		a1.test();
		B1 a2=new B3();//upcasting
		B3 a3=(B3) a2;//downcasting
		a3.best();
		a3.test();
		B1 a4=new B1();
		String s[]= {"123"};
		a4.main(s);

	}

}
