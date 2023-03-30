package string;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I LIVE IN BANGLORE KARNATAKA";
		int count=0;
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			//System.out.println(s1[i]);
			count++;
		}
		System.out.println(count);
	}

}
