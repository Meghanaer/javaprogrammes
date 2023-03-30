package grooming;

public class ReverseTheWordsInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Meghana is my name";
		String s1[]=s.split(" ");
		String s3="";
		for(int i=0;i<s1.length;i++) {
			String s2="";
			for(int j=s1[i].length()-1;j>=0;j--) {
				s2=s2+s1[i].charAt(j);
			}
			s3+=s2+" ";
		}
		
		System.out.print(s3);
	}

}
