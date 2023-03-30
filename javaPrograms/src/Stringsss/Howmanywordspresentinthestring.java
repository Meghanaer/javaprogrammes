package Stringsss;

public class Howmanywordspresentinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chitradurga is a fort city";
		String s1[]=s.split(" ");
		int count=0;
		for(int i=0;i<s1.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
