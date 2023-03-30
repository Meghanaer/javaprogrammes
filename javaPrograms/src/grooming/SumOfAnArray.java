package grooming;
import java.util.Scanner;
public class SumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		int sum=0;
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
			sum=sum+b[i];
			//System.out.println(b[i]);
		}
		System.out.println(sum);

	}

}
