package important;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=new int[4];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				c=a[i]+b[j];
			}
		}

	}

}
