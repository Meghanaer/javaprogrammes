package string;

public class char2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "JA V A Dev el op er";
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				if(s.charAt(i)=='A') {
					count++;
				}
					System.out.println(s.charAt(i));
					
			}
			
		}
		System.out.println(count);
	}

}
