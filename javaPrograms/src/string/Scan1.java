package string;
import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}
}


