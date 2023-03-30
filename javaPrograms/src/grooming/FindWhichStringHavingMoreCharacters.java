package grooming;
import java.util.Scanner;
public class FindWhichStringHavingMoreCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String s1[]=new String[a];
		String s2="";
		//int maxcount=0;
		for(int i=0;i<s1.length;i++) {
			s1[i]=s.next();
		//for(int j=0;j<s1[i].length();j++) {
			 //s2=s1[0];
			
			if(s2.length()<s1[i].length()) {
				 s2=s1[i];
			 }
		}
		System.out.println(s2);
		System.out.println(s2.length());

	}

}
