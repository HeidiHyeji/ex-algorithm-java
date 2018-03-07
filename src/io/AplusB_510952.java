package io;
import java.util.Scanner;
public class AplusB_510952 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		while((sum=sc.nextInt()+sc.nextInt())!=0) {
			System.out.println(sum);
		}
	}
}
