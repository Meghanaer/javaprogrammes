package grooming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int a=3;
		//		int fact=1;
		//		for(int i=a;i>=1;i--) {
		//			fact=fact*i;
		//		}
		//		System.out.println(fact);

		int b=12345;
		while(b>0) {
			int rem=b%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			b=b/10;
			System.out.println(fact);
		}
	}

}
