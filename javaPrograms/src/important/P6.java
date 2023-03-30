package important;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MALAYALAM";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s1+s.charAt(i);
			}
		System.out.println(s1);
		if(s.equals(s1)) {                          //we can not able to use equals operator in string
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
