package grooming;

import java.util.ArrayList;

public class GenericTypeOfArrayListPrintEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(15);
		a.add(25);
		a.add(30);
		for(int var:a) {
			
			if(var%2==0) {
				System.out.println(var);
			}
		}

	}

}
