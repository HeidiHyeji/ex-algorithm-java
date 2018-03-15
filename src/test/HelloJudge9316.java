package test;
import java.util.Scanner;
public class HelloJudge9316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println("Hello World, Judge "+i+"!");
		}
		sc.close();
	}
}
