package patterns;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
	
		int a=1;
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print(a++ + " ");
				}
				else {
					System.out.print(c++ +" ");
				}
			}
			System.out.println();
		}

	}

}
