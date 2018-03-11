package BruteforceSearch1;
import java.util.Scanner;
public class DateCalculation1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int year=0;
		int e=0;
		int s=0;
		int m=0;
		while(e != E || s != S || m != M) {
			year++;
			e++;
			s++;
			m++;
			if(e == 16) e=1;
			if(s == 29) s=1;
			if(m == 20) m=1;
		}
		System.out.println(year);
	}
}
