package basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1441;
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
			
		}
		
	//	System.out.println(a);
		if(sum==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
