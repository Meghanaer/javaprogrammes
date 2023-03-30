package patterns;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int a=1;
			char c='A';
			for(int j=1;j<=n;j++) {
				if(j==i) {
					System.out.print("@"+" ");
				}
				else if(j<i) {
					System.out.print(a++ +" ");
				}
				else {
					System.out.print(c++ +" ");
				}
			}
			System.out.println();
		}
	}
}



