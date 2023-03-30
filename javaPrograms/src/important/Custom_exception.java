package important;

public class Custom_exception  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21;
		if(age>18) {
			System.out.println("you are eligible to vote");
		}
		else {
			Youngerageexception a=new Youngerageexception("you are not eligible to vote");
			throw a;
		}
		

	}

}
