package stringssssss;
import java.util.Scanner;
public class ToReverseTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		String s3="";
		for(int i=s2.length-1;i>=0;i--) {
			s3=s3+s2[i]+" ";
		}
		System.out.println(s3);
	}

}
