package string;

public class Touppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple mango";

		for(int i=0;i<s.length();i++) {
			//char c=s.charAt(i);

			if(s.charAt(i)=='a') {
				String s1="";
				s1=s1+s.charAt(i);
				System.out.print(s1.toUpperCase());
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
