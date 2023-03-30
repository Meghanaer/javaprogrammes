package exception;

public class Tryandcatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("hlooo");

	}

}
