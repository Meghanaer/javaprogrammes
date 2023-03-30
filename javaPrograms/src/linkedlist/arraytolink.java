package linkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
public class arraytolink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add("hi");
		a1.add('m');
		a1.add(20);
		LinkedList l1=new LinkedList(a1);
		System.out.println(l1);
		l1.addFirst(1);
		l1.addLast(8);
		System.out.println(l1);
		
	}

}
