package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hi bye cya hi bye cya the bye hi";
		//String rev="";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].equals("hi")) {
				String a="";
				a=a+"bye";
				System.out.print(a+" ");
			}
			else {
				System.out.print(s2[i]+" ");
			}

		}

	}

}
