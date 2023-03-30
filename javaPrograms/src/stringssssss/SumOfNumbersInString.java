package stringssssss;
import java.util.Scanner;
public class SumOfNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2="";
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++) {
		//	char s2=s1.charAt(i);
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
				s2=s2+s1.charAt(i);
				count++;
			}
			Integer a=Integer.parseInt(s2);
			sum=sum+a;
			
		}
		System.out.println(sum);
	}

}
