package grooming;

public class Program9 {
	
	public static void main(String[] args) {
		String s="Nag2dra#";
		String s1="";
		String s2="";
		String s3="";
		for(int i=s.length()-1;i>=0;i--) {
			if(Character.isAlphabetic(s.charAt(i))) {
				s1=s1+s.charAt(i);
				
			}
			else if(Character.isDigit(s.charAt(i))) {
				s2=s2+s.charAt(i);		
				}
			else {
				s3=s3+s.charAt(i);
			}
		}

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
