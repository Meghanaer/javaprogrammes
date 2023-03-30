package grooming;

import java.util.ArrayList;

public class EvenNumbersStoreInSecondArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList();
		ArrayList<Integer> a1=new ArrayList();
		for(int i=1;i<=10;i++) {
			a.add(i);
		}
		for(int var:a) {
			if(var%2==0) {
				a1.add(var);
				}
		}
		
		System.out.print(a1);
	

}
}