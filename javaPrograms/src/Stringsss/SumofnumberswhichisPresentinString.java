package Stringsss;

public class SumofnumberswhichisPresentinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gadag@12345";
		String a="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				a=a+s.charAt(i);
				//sum=sum+s.charAt(a)
;			}
			//int b=Integer.parseInt(a);
			Integer b=Integer.parseInt(a);
			sum=sum+b;
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
