package vector;
import java.util.Vector;
public class V1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(10);
		v1.addElement("heloo");
		v1.addElement('m');
		v1.addElement(20);
		v1.addElement(20);
		v1.addElement(25.2);
		System.out.println(v1);
		v1.add(2, "meghu");
		System.out.println(v1);
		/*for(int i=0;i<v1.size();i++) {
			System.out.println(v1.elementAt(i));//here instead of using elementAt(), we can also use get method.
		}*/
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		//v1.clear();
		v1.removeAllElements();
		System.out.println(v1);
		
	}

}
