package basicprograms;

public class Power1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,4));
	}

	public static int power(int a,int power) {
		int pow=1;
		for(int i=1;i<=power;i++) {
			pow=pow*a;
		}
		return pow;

	}

}
