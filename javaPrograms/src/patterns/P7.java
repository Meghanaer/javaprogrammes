package patterns;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7;
		int column=5;
		char c='A';
		for (int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(i%2==1||j==1||j==column) {
				System.out.print(c++ +" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}

	}

}
