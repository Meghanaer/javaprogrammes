package interface1;

public class C2 implements C, C1{
	public void Fest() {
		System.out.println("heloo");
	}
     public void Rest() {
    	 System.out.println("hiii");
     }
     public void Test() {
    	 System.out.println("oye");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c1=new C2();
		c1.Fest();
		c1.Rest();
		c1.Test();
		
		C c2=new C2();//upcasting
		c2.Fest();
		c2.Rest();
		C1 c3=new C2();//upcasting
		c3.Test();
		C.Best();
		C1.Pest();
		
		
		
		
		
		
		

	}

}
