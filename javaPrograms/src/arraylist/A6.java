package arraylist;
import java.util.ArrayList;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("bye");
		a1.add('m');
		a1.add(25.25);
		a1.add(30);
		System.out.println(a1);
		a1.remove(25.25);
		System.out.println(a1);
		//System.out.println(a1.remove(3));
		System.out.println(a1.remove(1));
		System.out.println(a1);
		a1.remove(new Integer(10));   //converting non primitive object to non primitive integer.
		System.out.println(a1.remove(a1));
		System.out.println(a1);
		a1.remove(new Character('m'));
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);*/
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add(20);
		a2.add("bye");
		a2.add('m');
		a2.add(25.25);
		a2.add(30);
		ArrayList a3=new ArrayList();
		a3.add(10);
		a3.add("bye");
		a3.add(30);
		//a3.addAll(a2);
		//a2.removeAll(a3);
		//System.out.println(a2);
		//System.out.println(a3);
		//a3.removeAll(a2);
		//System.out.println(a3);
		a2.retainAll(a3);
		System.out.println(a2);
		

	}

}
