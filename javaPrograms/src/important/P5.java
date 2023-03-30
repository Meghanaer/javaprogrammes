package important;

public class P5 {
	String name;
	int id;
	P5(String name, int id){
		this.name=name;
		this.id=id;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P5 p1=new P5("meghu",01);
		P5 p2=new P5("meghuss",02);
		P5 p3=new P5("meghana",03);
		System.out.println(p1.name+" "+p1.id);
		System.out.println(p2.name+" "+p2.id);
		System.out.println(p3.name+" "+p3.id);
		
	}

}
