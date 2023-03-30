package grooming;

import java.util.ArrayList;

public class ToGetOddNumbersUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(5);
		a.add(13);
		a.add(24);
		for(Object var:a) {
			Integer b=(int)var;
			if(b%2==1) {
				System.out.println(b);
			}
		}
	}

}
