package arraylist;
import java.util.ArrayList;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		/*int count=0;
		int a[]= {1,2,5,6,9};
		for(int i:a) {
			if(i%2==0) {
			System.out.println(i);
			count++;
		}
		
			
	}
		System.out.println(count);

}*/
		a1.add(10);
		a1.add(20);
		a1.add("meghana");
		a1.add(10.1);
		for(Object i:a1) {
			
							
			System.out.println(i); 
		}
	}
}
