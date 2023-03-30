package grooming;

public class ExtractingUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1Ab2cd3#g*";
		String s1="";
		String s2="";
		String s3="";
		//int key=0;
		for(int i=0;i<s.length();i++) {
			int key=(Character.isAlphabetic(s.charAt(i)))?1:(Character.isAlphabetic(s.charAt(i)))?2:3;
			switch(key) {
			case 1:
				s1=s1+s.charAt(i);
				break;
			case 2:
				s2=s2+s.charAt(i);
				break;
			case 3:
				s3=s3+s.charAt(i);
				break;
			
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
