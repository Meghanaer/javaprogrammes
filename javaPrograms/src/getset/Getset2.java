package getset;

public class Getset2 {
	private String name;
	private int rollno;
	Getset2(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String s1) {
		this.name=s1;
	}
	public int getRollno() {
		return this.rollno;
	}
	/*
	 * public void setRollno(int a1) {
		this.rollno=a1;
	}*/

}
