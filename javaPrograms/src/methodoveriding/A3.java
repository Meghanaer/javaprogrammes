package methodoveriding;

public class A3 {
	void test() {
		int evencount=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				evencount++;
			}
		}
		System.out.println(evencount);
		System.out.println(1);
	}

}
