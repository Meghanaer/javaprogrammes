package exception;
import java.util.Scanner;
public class Driver  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age>18) {
			System.out.println("you can vote");
		}
		else {
			YoungerAgeException a1=new YoungerAgeException("you can't vote");
			throw a1;
		}

	}

}
