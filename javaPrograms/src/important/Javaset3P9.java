package important;
/*Create a method which accept String as a parameter and 
return type should also be  a string .If the use is passing any sentence as a 
string it should reverse the sentence and the reversed string has to be returned.
Ex:         My name is Ram.
Reversed:   Ram is name My.*/
public class Javaset3P9 {
	String s2="";
	public static String reverse(String s) {
		String s1[]=s.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--) {
			 s2=s1[i];
		}
		for(int i=0;i<s2.length();i++) {
			
		}
		return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=reverse("my name is ram");
		for(int i=0;i<s2.length();i++) {
			
		}
	}

}
