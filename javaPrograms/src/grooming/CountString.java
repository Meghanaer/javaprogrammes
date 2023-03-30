package grooming;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Meghana is my name";
		int count=0;
		s=s.replace(" ", "");
		for(int i=0;i<s.length();i++) {
			
			count++;
		}
		System.out.println(count);
	}

}
