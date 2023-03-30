package important;
/*Create a method which should accept string as a parameter and returns a string,
and this method should remove all the duplicate character present in the string*/

public class Javaset4P1 {
	
	public static String remove(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s1.indexOf()==-1) {
				s1=s1+s.charAt(i);
				
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=remove("meghana");
		System.out.println(a);
	}

}
