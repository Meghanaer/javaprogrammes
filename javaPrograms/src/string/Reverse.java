package string;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I LIVE IN BANGLORE KARNATAKA";
		String rev="";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			rev=rev+s1[i]+" ";
			
		}
		System.out.println(rev);
	}

}
