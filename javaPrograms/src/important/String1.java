package important;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="[1,2,3,71,89,4]";
		String s1[]=s.split(" ");
		int sum=0;
		
		
		
		for(int i=0;i<s.length();i++) {
			s.replace("[", " ");
			s.replace("]", " ");
			s.replace(",", " ");
			
			System.out.println(s.charAt(i));
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				sum=sum+s.charAt(i);
			}
		}
		System.out.println(sum);
	}

}
