package string;

public class Char3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JavaAaA";
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(i)=='A'||s.charAt(i)=='a') {
					count++;
				}
			}
			System.out.println(count);
	}
}
