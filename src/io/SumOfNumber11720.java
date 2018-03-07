package io;
import java.util.Scanner;
public class SumOfNumber11720 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		for(int i=0;i<N;i++) {
			sum+=Integer.parseInt(str.substring(i,i+1));
		}
		System.out.println(sum);
		sc.close();
	}
}
