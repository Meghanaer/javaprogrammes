package patterns;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		char c='A';
		int row=5;		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
						System.out.print((j==1||j==i)?c++ +" ":'*'+" ");
					}
				else {
					if(j==1||j==i){
					System.out.print(a++ +" ");
					}
					else {
						System.out.print('*'+" ");
					}
				
			}
		}
			System.out.println();
			
		}

	}
}


