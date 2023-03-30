package grooming;

import java.util.Arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,1,2,3,5,8,5};
		int b[]=new int[a.length];
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
		}
		b[j]=a[a.length-1];
		for(int i=0;i<=j;i++) {
			System.out.println(b[i]);
		}
	}

}
