package exception;

public class Tcf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0);
		}
		catch(Exception e) {
			//try {
				System.out.println(5);
				
			//}
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				System.out.println(1/0);
			}
			catch(Exception e) {
				System.out.println("exception handled 1");
				System.out.println(e.toString());
			}
			finally {
				System.out.println("meghusss");
				}
			}
		System.out.println("hlooo.....");
		
	}

}
