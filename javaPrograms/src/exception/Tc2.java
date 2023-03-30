package exception;

public class Tc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0);
			System.out.println(3);
		}
		/*catch(Exception e) {
			System.out.println(e);
		}*/
		catch(Throwable e) {
			System.out.println("exception handled");
		}
		System.out.println("bye");
	}

}
