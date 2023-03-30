package grooming;

public class CountTheNumbersInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My1 name2 is3 Rajesh4 Singh5";
		String s1="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				int s2=Integer.parseInt(s.charAt(i)+"");
				sum=sum+s2;
			}
		}
		System.out.println(sum);

	}
}
