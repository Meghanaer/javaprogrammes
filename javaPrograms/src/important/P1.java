package important;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean key=true;
		int sum=0;
		for(int i=1;i<=50;i++) {
			key=true;
			int a=i;
			for(int j=2;j<a;j++) {
				if(a%j==0) {
					key=false;
					break;
				}
			}

			if(key==true) {
				sum=sum+a;
				//System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

}
