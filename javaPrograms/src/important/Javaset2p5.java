package important;

public class Javaset2p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC123DEF324";
		//String a="";
		int sum=0;
		for(int i=1;i<s.length();i++) {
			//a=a+s.charAt(i);
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum=sum+s.charAt(i);
				}
			}
			System.out.println(sum);
	}

}
