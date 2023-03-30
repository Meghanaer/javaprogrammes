package important;
import java.util.Scanner;
/*
 * WAP to check weather element is present in the given array or not
NOTE:-In the above program user should pass the size and element and element to be 
Searched.
[Hint:-Use Scanner class]
 */
public class Javaset3p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[] b=new int[a];
		
		for(int i=0;i<b.length;i++) {
			 b[i]=s.nextInt();
			 }
		
		System.out.println("element to be searched");
		int c=s.nextInt();
		for(int i=0;i<b.length;i++) {
			if(b[i]==c) {
				System.out.println("present");
			
			}
		
			else {
				System.out.println("not present");
				
			}
		
		}
		

	}

}
