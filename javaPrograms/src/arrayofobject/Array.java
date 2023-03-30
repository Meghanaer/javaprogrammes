package arrayofobject;

public class Array {
	String name;
	int rollno;
	int count=0;
	Array(String name,int rollno ){
		count++;
		this.name=name;
		this.rollno=rollno;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a1=new Array("meghana",01);
		Array a2=new Array("pragathi",02);
		Array a3=new Array("manu",03);
		
		Array a4[]=new Array[] {a1,a2,a3};
		for(int i=0;i<a4.length;i++) {
			System.out.println(a4[i].name+" "+a4[i].rollno);
		}
	}

}
