package string;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="the name is yash";
		String s2[]=s1.split(" ");
		String a="";
		for(int i=0;i<s2.length;i++) {
			if(s2[i].equals("yash")) {
				a=a+"Yash";
				System.out.print(a+" ");
			}
			else {
				System.out.print(s2[i]+" ");
			}
		}
	}
}
		