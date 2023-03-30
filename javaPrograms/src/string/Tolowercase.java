package string;

public class Tolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I LIVE IN BANGLORE KARNATAKA";
		//String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='I'||s.charAt(i)=='A') {
				String s1="";
				s1=s1+s.charAt(i);
				System.out.print(s1.toLowerCase());
			}
			else {
				System.out.print(s.charAt(i));	
			}

		}
	}

}
