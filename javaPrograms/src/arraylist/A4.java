package arraylist;
import java.util.ArrayList;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add("hi");
		a1.add(60);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}

	}

}
