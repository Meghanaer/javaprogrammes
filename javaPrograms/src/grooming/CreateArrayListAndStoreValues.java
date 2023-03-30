package grooming;

import java.util.ArrayList;

public class CreateArrayListAndStoreValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("megh");
		a.add('m');
		a.add(true);
		
		for(Object var:a) {
			System.out.println(var);
		}

	}

}
