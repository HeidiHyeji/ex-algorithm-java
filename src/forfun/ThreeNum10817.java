package forfun;

import java.util.Scanner;

public class ThreeNum10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A > B) {// AB
			if (C > A) {// CAB
				System.out.println(A);
			} else {// ABC,ACB
				if (B > C) {// ABC
					System.out.println(B);
				} else {// ACB
					System.out.println(C);
				}
			}
		} else {// BA
			if (C > A) {// CBA,BCA
				if (C > B) {// CBA
					System.out.println(B);
				} else {// BCA
					System.out.println(C);
				}
			} else {// BAC
				System.out.println(A);
			}
		}
	}
}
