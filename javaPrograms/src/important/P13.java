package important;
/** * * * * *
*                                 
  *
    *
      *
        *    */
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i==1||j==i) {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

	}

}
