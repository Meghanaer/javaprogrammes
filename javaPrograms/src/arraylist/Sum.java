package arraylist;
import java.util.ArrayList;
public class Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Integer sum=0;
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		for(Integer i:a1) {
			sum=sum+i;      //sum=sum+i.intvalue();//unboxing
		}
		System.out.println(sum);
	}

}
