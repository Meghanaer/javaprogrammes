package grooming;

import java.util.Scanner;

public class ToreverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		//String s4="";
		String s3="";
		for(int i=0;i<s1.length();i++) {

			String s2=s1.substring(s1.length()/2, s1.length());

			for(int j=s2.length()-1;j>=0;j--) {
				s3=s3+s2.charAt(j);
			}
			//System.out.println(s3);
		}
		System.out.println(s3);
	}

}