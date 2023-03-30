package important;
/*Create 3 methods give implementation to all the 3 methods, 
from 1st method created call the second method followed by 
3rd method(method recursion ). Finally call the first method inside main method so 
that all the method gets executed.*/
public class Javaset3P10 {
	public static void add() {
		System.out.println("hiii");
		sub();
	}
	public static void sub() {
		System.out.println("hiii");
		multi();
	}
	public static void multi() {
		System.out.println("hiii");
		multi();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

}
