package important;

public class ToPrintInfiniteNumbers {
	public static void main(String[] args) {
		int num = 1;
		while(num>=1) {
			if(num==1) {
				for(int i=1;i<=5;i++) {
					System.out.println(num);
				}
			}
			else if(num==2) {
				for(int i=1;i<=4;i++) {
					System.out.println(num);
				}
			}
			else {
				System.out.println(num);
				break;
			}
			num++;
		}
	}
}