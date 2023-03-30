package grooming;

public class ReplaceTheWordWithoutUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is XYZ";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			
			if(s1[i].equals("XYZ")) {
				System.out.print("meghana");
			}
			else {
				System.out.print(s1[i]+" ");
			}
		}

	}

}
