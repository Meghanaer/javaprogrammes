package string;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HI HELLO 'UNCLE' HOW ARE 'YOU' DOING?";
		String s1[]=s.split(" ");
		String a="";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("'UNCLE'")||s1[i].equals("'YOU'")) {
				for(int j=s1[i].length()-1;j>=0;j--) {
					a=s1[i];
					System.out.print(a.charAt(j));
				}
			}
			else {
				System.out.print(s1[i]+" ");
			}
		}

	}

}
