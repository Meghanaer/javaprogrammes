package basicprograms;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int count=0;
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			count++;
			a=a/10;
		}
			while(temp>0) {
				int rem=temp%10;
				int b=(int) power(rem,count);
				sum=sum+b;
				temp=temp/10;
			}
			System.out.println(sum);
			if(sum==153) {
				System.out.println("armstrong number");
			}
			else {
				System.out.println("not a armstrong number");
			}
	}
	public static int power(int c,int power) {
		int pow=1;
		for(int i=1;i<=power;i++) {
			pow=pow*c;
		}
		return pow;
	}

}
