package Stringsss;

public class Toreversethesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chitradurga is afort city";
		String s1[]=s.split(" ");
		String rev="";
		for(int j=s1.length-1;j>=0;j--) {
			rev=rev+s1[j]+" ";
			
		}
		System.out.println(rev);
	}

}
