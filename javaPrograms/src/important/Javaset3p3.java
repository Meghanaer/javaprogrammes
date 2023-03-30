package important;

public class Javaset3p3 {
	public void vowels(String s) {


		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		Javaset3p3 j=new Javaset3p3();
		j.vowels("anemmiolu");


	}

}


