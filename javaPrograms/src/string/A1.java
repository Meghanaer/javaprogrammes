package string;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ramanna is my name";
		String s1[]=s.split(" ");
		String max=s1[0];
		int count=s1[0].length();
		for(int i=0;i<s1.length;i++) {
			String a=s1[i];
			if(a.length()>count) {
				max=a;
			}
		}
		System.out.println(max);

	}

}
