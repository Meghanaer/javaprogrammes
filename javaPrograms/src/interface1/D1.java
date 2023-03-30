package interface1;

public class D1 implements D{
	public int add() {
	int a=1,b=2,c=0;
	return c=a+b;
	}
	public double sub() {
		int a=10,b=5,c=0;
		return c=a-b;
	}
	public String multi() {
		String s=("meghs");
		return s;
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 d1=new D1();
		System.out.println(d1.add());
		System.out.println(d1.sub());
		System.out.println(d1.multi());
		}

}
