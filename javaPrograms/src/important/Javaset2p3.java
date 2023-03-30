package important;

public class Javaset2p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javaset2p3 ob=new Javaset2p3();
		System.out.println(ob.palindrome(1221));
	
 }
	public boolean palindrome(int a) {
		int sum=0;
		int temp=a;
		boolean key=true;
		while(a>0) {
			int rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(sum==temp) {
			key=true;
		}
		else {
			key=false;
		}
		return key;
	}

}
