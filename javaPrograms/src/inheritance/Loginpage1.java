package inheritance;

public class Loginpage1 extends Loginpage {
	void password() {
		System.out.println("2580");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginpage1 l1=new Loginpage1();
		l1.password();
		Loginpage l2=new Loginpage1();//upcasting
		l2.password();
		
	}

}
