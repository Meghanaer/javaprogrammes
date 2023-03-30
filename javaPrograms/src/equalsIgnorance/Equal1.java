package equalsIgnorance;

public class Equal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		String s2="MadaM";
		String s3="hlooo";
		String s4="hloooo";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3==s4);


	}

}
