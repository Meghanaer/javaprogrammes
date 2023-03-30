package string;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1JAV2A3";
		String a="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='1'&& s.charAt(i)<='9') {
				a=a+s.charAt(i);
				}
		}
			System.out.println(a);
		
	}

	}


