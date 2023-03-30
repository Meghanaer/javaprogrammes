package Stringsss;

public class Reversethewordsinthesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="priya is good girl";
		String s1[]=s.split(" ");
		String rev="";
		for(int i=0;i<s1.length;i++) {
					for(int j=s1[i].length()-1;j>=0;j--) {
				rev=rev+s1[i].charAt(j)+"";
				
			}
			}
		System.out.print(rev);
	}

}
