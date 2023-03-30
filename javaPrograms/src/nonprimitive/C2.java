package nonprimitive;

public class C2 extends C1{
	public void sub(int a) {
		System.out.println("abcd123");
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 a3=new C1();
		a3.sub(3);
		C1 a1=new C2();
		a1.sub(10);
		C2 a2=(C2) a1;
		a1.sub(2);
		
		
	}

}
