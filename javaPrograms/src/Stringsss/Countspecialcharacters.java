package Stringsss;

public class Countspecialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="g2a^jen5d%ra8g#ad6a@";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
