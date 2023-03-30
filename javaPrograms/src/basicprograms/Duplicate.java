package basicprograms;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbccdd";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char s2=s.charAt(i);
			if(s1.indexOf(s2)==-1) {
				s1=s1+s2;

			}
		}
		System.out.println(s1);

	}

}