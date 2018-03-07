package io;

import java.util.Scanner;
public class PrintOutAsItIs11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println(sc.nextLine());
			} catch (RuntimeException e) {}
		}while(sc.hasNextLine());
	}
}
