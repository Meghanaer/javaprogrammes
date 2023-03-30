package string;

public class Sub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA DEVELOPER";
		System.out.println(s);
		System.out.println(s.substring(2, 10));
		s=s.substring(2,10);
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
			System.out.println(rev);
	}

}
