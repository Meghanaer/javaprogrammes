package array;
//Java Program to sort the elements of an array in ascending order
public class AscendingOder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,9,51,67,55};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
