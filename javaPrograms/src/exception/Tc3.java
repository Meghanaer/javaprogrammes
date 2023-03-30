package exception;

public class Tc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("adcb");
			System.out.println("1234");
			int a[]= {1,2,4,5,3};
			System.out.println(a[a.length]);
			System.out.println(2);
			}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("hlo...");
		
	}

}
