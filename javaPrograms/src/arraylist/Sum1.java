package arraylist;
import java.util.ArrayList;
public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		Integer sum=0;
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		for(Object i:a1) {
			Integer a=(Integer)i;
			int c=a;
			sum=sum+c;      //sum=sum+i.intvalue();//unboxing
		}
		System.out.println(sum);
		}



	}


