package arrayofobject;

public class Array1 {
	//int a=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array1 a1=new Array1();
		Array1 a2=new Array1();
		Array1 a3=new Array1();
		Array1 a4=new Array1();
		
		Array1 a5[]=new Array1[] {a1,a2,a3,a4};
		for(int i=0;i<a5.length;i++) {
			System.out.println(a5[i]);
		}
	}
	}
