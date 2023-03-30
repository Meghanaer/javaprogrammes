package exception;
import java.util.Scanner;
public class MatrimonyException extends RuntimeException{ 
	 MatrimonyException(String msg){
		 super(msg);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		if(age>20) {
			System.out.println("you are eligibleL");
		}
		else {
			MatrimonyException a1=new MatrimonyException("Dont be hurry");
			throw a1;
		}

	}


	}


