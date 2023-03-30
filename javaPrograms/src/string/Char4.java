package string;

public class Char4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MADAM";
		String rev="";
		String temp=s1;
		System.out.println(s1);
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
	if(rev.equals(temp)) {
		
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	System.out.println(rev.equals(temp));

	}
}


