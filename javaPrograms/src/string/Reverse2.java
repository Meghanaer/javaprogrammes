package string;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I LIVE IN BANGLORE KARNATAKA";
		String s1[]=s.split(" ");
		String rev="";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("BANGLORE")) {
				
				for(int j=s1[i].length()-1;j>=0;j--) {
					rev=s1[i];
					System.out.print(rev.charAt(j));
					}
				System.out.print(" ");
				}
		
			else {
				System.out.print(s1[i]+" ");
			}
		}

	}

}
