package grooming;

import java.util.Scanner;

public class PrimeNumer {

	public static void main(String[] args) {
		int a=3;
		Boolean key=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				key=false;
				break;
			}
		}
		if(key==true) {
			System.out.println(a+" is prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}
