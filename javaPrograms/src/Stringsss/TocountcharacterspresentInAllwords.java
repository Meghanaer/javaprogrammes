package Stringsss;

public class TocountcharacterspresentInAllwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rama is good boy";
		String s1[]=s.split("");
		int count=0;
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]);
			for(int j=0;j<s1[i].length()-1;j++) {
				
				count++;
				System.out.println(count);
			}
		}

	}

}
