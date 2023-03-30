package arraylist;
import java.util.ArrayList;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("hello");
		a1.add(50);
		ArrayList a2=new ArrayList();
		a2.add(60);
		a2.add("bye");
		//a2.add(a1);
		System.out.println(a2);
		a2.add(30);
		a2.addAll(a1);
		a2.add(13);
		System.out.println(a2);
		System.out.println(a2.get(0));
		System.out.println(a2.get(1));
	

	}

}
