package patterns;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=6;i++) {
			int a=0;
			for(int j=i;j<=6;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	
		for (int i=1;i<=5;i++) {
			int a=1;
			for(int j=i;j<=5;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}

