package exception;
import java.util.Scanner;
public class License extends RuntimeException{
	License (String msg){
		super(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age>18) {
			System.out.println("you can apply for DL");
		}
		else {
			License a1=new License("Drive cycle only");
			throw a1;
		}

	}

}
