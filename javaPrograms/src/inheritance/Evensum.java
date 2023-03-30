package inheritance;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		for(int i=10;i<=50;i++) {
			if(i%2==0) {
				evensum=evensum+i;
			}
		}
		System.out.println(evensum);
	}

}
