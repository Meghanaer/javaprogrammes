package string;

public class Tochar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="hiihi hloo  ";
		char c[]=s.toCharArray();
		System.out.println(c[6]);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
			
		}
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("hloo"));
		System.out.println(s.indexOf('i',3 ));
		System.out.println(s.indexOf("hi", 3));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 9));
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		String s1="MEGHANA";
		System.out.println(s1.toLowerCase());
		String s2="hlo hi hi";
		System.out.println(s2.startsWith("hlo"));
		System.out.println(s2.startsWith("hi", 4));
		System.out.println(s2.endsWith("hii"));
		System.out.println(s2.contains("hi"));
		System.out.println(s2.isEmpty());*/
		String s3="I LIVE IN BANGLORE KARNATAKA";
		int count=0;
		String s4[]=s3.split(" ");
		for(int i=0;i<s4.length;i++) {
		System.out.println(s4[i]);
		
		String s5[]=s3.split("A");
		System.out.println(s5[i]);
		}
		String s6="hi byE Hi";
		System.out.println(s6.replace('h', 'y'));
		System.out.println(s6.replace("bye", "hi"));
		System.out.println(s6.replaceAll("[A-Z]","0"));
	}
		
	}

		
	


