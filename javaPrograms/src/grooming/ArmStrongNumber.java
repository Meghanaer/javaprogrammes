package grooming;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234;
		int count=0;
		int temp=a;
		int c=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			count++;
			a=a/10;
		}
		while(temp>0) {
			int rem1=temp%10;
			int b=(int) Math.pow(rem1, count);
			sum=sum+b;
			temp=temp/10;
		}
		if(sum==c) {
			System.out.println("armstromg number");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}

}
