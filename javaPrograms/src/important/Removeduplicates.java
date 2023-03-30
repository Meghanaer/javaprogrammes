package important;

import java.util.HashMap;

public class Removeduplicates {
	static int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h1=new HashMap();
		String s="hihihlo";
		char c[]=s.toCharArray();
		for(int i:c) {
			h1.put(c, a);
			
		}
		System.out.println(h1.keySet());
		/*for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			h1.put(s.charAt(i),a++);
			//System.out.println(h1);
		}
		System.out.println(h1);*/
	}

}
