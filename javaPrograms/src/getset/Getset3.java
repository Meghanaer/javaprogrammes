package getset;

public class Getset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getset2 g1=new Getset2("meghana",01);
		Getset2 g2=new Getset2("rahul",02);
		Getset2 g3=new Getset2("gurudeep",03);
		
		System.out.println(g1.getName());
		System.out.println(g1.getRollno());
		System.out.println(g2.getName());
		System.out.println(g2.getRollno());
		System.out.println(g3.getName());
		System.out.println(g3.getRollno());
		g3.setName("deepu");
		System.out.println(g3.getName());
		
	}

}
