package inheritance;

public class C2 extends C1{
	public void test() {
		System.out.println("meghus");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C2 c=new C2();
		c.add();
		c.sub();
		System.out.println(c.multi(2,3));
		System.out.println(c.div(5 , 2));

	}

}
