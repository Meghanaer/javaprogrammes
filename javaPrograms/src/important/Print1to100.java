package important;

public class Print1to100 {
	public static void add(int a) {
		if(a<=100) {
			System.out.println(a);
			add(a+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1to100.add(1);

	}
	

}
