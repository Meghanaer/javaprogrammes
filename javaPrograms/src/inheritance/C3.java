package inheritance;

public class C3 extends C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 c=new C3();
		c.sub();
		c.add();
		System.out.println(c.multi(2,3));
		System.out.println(c.div(5 , 2));
		c.test();
		C2 c1=new C2();
		c1.add();
		c1.sub();
		System.out.println(c1.multi(2,3));
		System.out.println(c1.div(5 , 2));
		c1.test();
	}

}

