package forfun;

import java.util.Scanner;
public class SexagenaryCycle7572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%12<4) System.out.print((char)(N%12+73));
		else System.out.print((char)(N%12+61));
		if(N%10<4) System.out.print(N%10+6);
		else System.out.print(N%10-4);
		
	}
}
