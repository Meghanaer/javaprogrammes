package methodoveriding;



public class A2 extends A1 {
	int add() {
		int a=5;
		int b=5;
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1=new A1();
        System.out.println(a1.add());
        A2 a2=new A2();
        System.out.println(a2.add());
        a1=a2;
        System.out.println(a1.add());
        System.out.println(a2.add());
        }
	}
