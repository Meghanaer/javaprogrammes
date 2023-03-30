package string;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I LIVE IN BANGLORE KARNATAKA";
		String rev="";
		String s1[]=s.split(" ");

		for(int i=0;i<s1.length;i++) {
			String a=s1[i];
			if(a.equals("BANGLORE")) {
				for(int j=s.length()-1;j>=0;j--) {
					rev=rev+s.charAt(j)+" ";

				}
				System.out.println(rev);
			}
			else {
				System.out.print(s1[i]);
			}

		}
	}
}
