package grooming;

public class REmovingDuplicatesWithoutUsingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,2,1,5,6,6,1};
		int b[]=new int[a.length];
		int k=0;
		for(int var:a) {
			int key=0;
			for(int i=0;i<b.length;i++) {
				if(var==b[i]) {
					key++;
					break;
				}
			}
			if(key==0) {
				b[k]=var;
				k++;
			}
			
		}
		for(int i=0;i<k;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
