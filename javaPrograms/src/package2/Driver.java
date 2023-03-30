package package2;
import package1.Test;
public class Driver extends package2.Test{
	public void A5() {
		System.out.println("oye");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a1=new Test();
		a1.A1();
		a1.A2();
		package1.Test a4=new package2.Test();//upcasting
		a4.A1();
		a4.A2();
		package2.Test a6=(package2.Test) a4;//downcasting
		a6.A1();
		a6.A2();
		a6.A3();
		a6.A4();
		package2.Test a2=new package2.Test();//fully qualified classname
		a2.A3();
		a2.A4();
		package2.Test a3=new package2.Driver();//upcasting
		a3.A3();
		a3.A4();
		package2.Driver a7=(package2.Driver) a3;//downcasting
		a7.A1();
		a7.A2();
		a7.A3();
		a7.A4();
		a7.A5();
		package1.Test a5=new package2.Driver();//upcasting
		a5.A1();
		a5.A2();
		package2.Driver a8=(package2.Driver) a5;//downcasting
		a8.A1();
		a8.A2();
		a8.A3();
		a8.A4();
		a8.A5();
		
		
		
		

	}

}
