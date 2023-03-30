package grooming;

public class CountCapitalAndSmallLettersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Meghana is my name";
		int scount=0;
		int ccount=0;
		s=s.replace(" ", "");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97&&s.charAt(i)<=122) {
				scount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("small letters count:"+ scount);
		System.out.println("capital letters count:"+ ccount);

	}

}
