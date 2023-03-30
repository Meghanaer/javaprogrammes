package wrapper;

public class Integer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1A2B3C";
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				String b="";
				b=b+s.charAt(i);
				Integer c=Integer.parseInt(b);
				sum=sum+c;
			}
		}
		
		System.out.println(sum);
		//Integer c=Integer.parseInt(b);
		//System.out.println(c);
	}

}
