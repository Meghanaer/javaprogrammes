package string;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is mujeeb";
		String s2[]=s.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}

	}

}
