package grooming;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{9,8,7,9,6,3}};
		for(int i=0;i<a.length;i++) {
			int b[]=a[i];
			for(int j=0;j<b.length;j++) {
		//for(int j=0;j<a[i].length;j++){ 
				//system.out.print(a[i][j]);
		System.out.print(b[j]+" ");
			}
			System.out.println();
	}
	}
}
