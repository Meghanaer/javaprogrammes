package important;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4 p=new P4();
		String s="meghana";
		p.parameter(s);
	}
	public void parameter(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			count++;
			//System.out.println(count);
		}
		System.out.println(count);
	}

}
