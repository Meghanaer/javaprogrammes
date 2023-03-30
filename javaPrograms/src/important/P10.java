package important;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1452;
		System.out.println(strong(a));
		

	}
	public static boolean strong(int a) {
		int sum=0;
		int temp=a;
		boolean key=false;
		while(a>0) {
			int rem=a%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
				sum=sum+fact;
				a=a/10;
			
			if(sum==temp) {
				key=true;
			}
			else {
				key=false;
			}
			
		}
		return key;
		
	}
	

}
