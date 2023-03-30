package grooming;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
				sum=sum+fact;
			}
			a=a/10;

		}
		if(temp==sum) {
			System.out.println(sum+" strong number");
		}
		else {
			System.out.println("not a strong number");
		}
	}
}
