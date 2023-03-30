package abstraction;

public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Bmw();
		c1.color();
		c1.engine();
		c1.seats();
		c1.tyre();
		System.out.println();
		Bmw b1=new Benz();
		b1.color();
		b1.engine();
		b1.tyre();
		b1.seats();

	}

}
