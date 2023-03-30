package exception;

public class Tcf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("meghana");
		}
		System.out.println("meghus");

	}

}
