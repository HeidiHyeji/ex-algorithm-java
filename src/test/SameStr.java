package test;
import java.util.Scanner;
public class SameStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
		char[] cntA = new char[58];
		char[] cntB = new char[58];
		boolean res=true;
				
		//'A'->를 0으로 보고 넣는다
		for(int i=0;i<A.length;i++) {
			cntA[A[i]-'A']++;
		}
		for(int i=0;i<B.length;i++) {
			cntB[B[i]-'A']++;
		}
		for(int i=0;i<cntA.length;i++) {
			if(cntA[i]!=cntB[i]) {
				res=false;
			}
		}
		System.out.println(res);
		sc.close();
	}

}
