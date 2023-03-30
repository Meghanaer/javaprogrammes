package important;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=8;
		for(int i=1;i<=4;i++) {
			if(i%2==1) {
			for(int j=1;j<=4;j++) {
				System.out.print(a++ +" ");
			}
		}
			else {
				for(int k=4;k>=1;k--) {
					System.out.print(k++ +" ");
				}
			}
			System.out.println();

	}
	}}

