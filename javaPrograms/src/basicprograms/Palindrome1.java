package basicprograms;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="meghana";
		System.out.println(palindrome(s));
		if(s.equals(palindrome(s))) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
	}
	public static String palindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
