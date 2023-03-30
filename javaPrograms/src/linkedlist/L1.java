package linkedlist;
import java.util.LinkedList;
public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add("hlo");
		l1.add('m');
		l1.add(12.2);
		System.out.println(l1);
		l1.addFirst("meghu");
		System.out.println(l1);
		l1.addLast('a');
		System.out.println(l1);
		//l1.getFirst();
		System.out.println(l1.getFirst());
		//l1.getLast();
		System.out.println(l1.getLast());
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
	
	}

}
