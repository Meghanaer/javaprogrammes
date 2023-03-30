package patterns;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int a=1;
		 char c='A';
		 for(int i=1;i<=n;i++) {
			 for(int j=i;j<=n;j++) {
				 if(i%2==0) {
					 if(j==i||j==5) {
					 System.out.print(a++ +" ");
				 }
				 else {
					 System.out.print('*'+" ");
				 }
				 }
				 else {
					 if(j==i||j==5){
				 System.out.print(c++ +" "); 
				 }
				 else {
					 System.out.print('*'+" ");
				 }
				 }
			 }
			 System.out.println();
		 }

	}
}


