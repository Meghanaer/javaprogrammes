package nonprimitive;

public class Fest {
	public static void main(String[] args) {
		Pest p1=new Pest();
		Test t1=new Test();
		p1.credit(t1);
		Test t2=new Best();//upcasting
		t2.card();
		p1.credit(t2);
		Best b1=(Best) t2;//downcasting
		p1.credit(b1);
		Test t3=new Rest();//upcasting
		p1.credit(t3);
		Rest r1=(Rest) t3;
		p1.credit(r1);
		}
	}
