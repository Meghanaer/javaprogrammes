package basicprograms;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int count=0;
		int b=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			count++;
			a=a/10;
		}
		while(b>0) {
			int rem=b%10;
			int c=(int) Math.pow(rem,count);
			sum=sum+c;
			b=b/10;
		}
		System.out.println(count);
		System.out.println(sum);
	
	if(sum==153) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not a armstrong number");
	}
}
}
