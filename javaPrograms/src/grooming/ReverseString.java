package grooming;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Meghana";
		//String s1="";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
		
		//System.out.println(s1);
		//String s2=s.substring(0,1).toLowerCase();
		//s2=s2+s.substring(1,7).toUpperCase();
		//System.out.println(s1);
		//System.out.println(s2);
		if(s.charAt(i)>=97&&s.charAt(i)<=122) {
			s2+=(s.charAt(i)+"").toUpperCase();
		}
		else {
			s2+=(s.charAt(i)+"").toLowerCase();
		}
		
	}
		System.out.println(s2);
}
}