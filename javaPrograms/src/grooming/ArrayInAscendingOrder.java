package grooming;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,2,1,41,9,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			System.out.print(a[i]+",");
		}

	}

}
