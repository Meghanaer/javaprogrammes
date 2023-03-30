package stringssssss;
import java.util.Scanner;
public class ToreverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}

	}

}
