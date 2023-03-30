package arraylist;
import java.util.ArrayList;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		ArrayList a2=new ArrayList();
		
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			//for(int i:a1) {
			
			if(a1.get(i)%2==0) {
			a2.add(a1.get(i));
			}
			
		}
		System.out.println(a2);
	}

}
