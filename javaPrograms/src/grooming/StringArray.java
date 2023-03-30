package grooming;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String s1[]=new String[a];
		int count=0;
		for(int i=0;i<s1.length;i++) {
			s1[i]=s.next();

			//System.out.println(s1[i]);

			if(s1[i].contains("a")) {
				count++;
			}
		}

		System.out.println(count);
	}

}
