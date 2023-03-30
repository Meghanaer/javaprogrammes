package Stringsss;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MADAM";
		String temp=s;
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a=a+s.charAt(i);
		}
		System.out.println(a);
		if(temp.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
