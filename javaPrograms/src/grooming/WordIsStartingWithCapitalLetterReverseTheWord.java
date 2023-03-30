package grooming;

public class WordIsStartingWithCapitalLetterReverseTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Rajesh Singh";
		String s1[]=s.split(" ");
		String s3="";
		for(int j=0;j<s1.length;j++) {
			if(s1[j].charAt(0)>='A' && s1[j].charAt(0)<='Z' ) {
				s3=s3+reverse(s1[j]+" ");
			}
			else {
				s3=s3+" "+s1[j];
			}
		}
		System.out.println(s3);
		
	}
	
	public static String reverse(String s) {
		String s4="";
		for(int i=s.length()-1;i>=0;i--) {
			s4=s4+s.charAt(i);
		}
		return s4;
	}

	}


