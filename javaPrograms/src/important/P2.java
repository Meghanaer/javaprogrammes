package important;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a;
		int count=0;
		int sum=0;
		int m=a;
		while(a>0) {
		int rem=a%10;
		count++;
		a=a/10;
	}
		while(temp>0) {
			int rem=temp%10;
			int b=(int) Math.pow(rem,count);
			sum=sum+b;
			temp=temp/10;
		}
		if(sum==m) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}
