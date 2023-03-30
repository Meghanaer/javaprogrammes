package important;
//Create a method which accept string as a parameter and return type int. 
//This method should return how many vowels are there in the given string.

public class Javaset3P8 {
	public static int vowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(vowels("MEGHANA"));

	}

}
