package patterns;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2==1) {
					if(j%2==0) {
				System.out.print(0+" ");
			}
				    else {
					System.out.print(1+" ");
				}
		}
				else if(i%2==0){
						if(j%2==1) {
							System.out.print(0+" ");
						}
						else {
							System.out.print(1+" ");
						}
				}
			}
			System.out.println();

	}
	}
}
