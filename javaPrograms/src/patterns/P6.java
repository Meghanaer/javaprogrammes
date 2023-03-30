package patterns;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		char c='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1||j==4) {
					System.out.print(a++ +" ");
				}
				
				else {
					if(j==1||i==5) {
						System.out.print(c++ +" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

	}

}
