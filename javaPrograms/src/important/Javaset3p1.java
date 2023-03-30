package important;
import java.util.Scanner;
public class Javaset3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
			 fact=fact*i;
				}
			sum=sum+fact;
			a=a/10;
		}
		if(sum==temp) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not a strong number");
		}
	}
}
