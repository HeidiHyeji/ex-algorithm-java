package BruteforceSearch1;
import java.util.Arrays;
import java.util.Scanner;
public class ToTheMax10819 {
	static int[] next_permutation(int[]A) {
		int i=A.length-1;
		while(i>0 && A[i-1]>=A[i]) i--;//같다는 조건이 없으면 중복된 수가 있을 때 무한 루프에 빠짐
		if(i<=0) return null;//마지막 순열일 경우
		int j=A.length-1;
		while(j>=i && A[i-1]>=A[j]) j--;//같다는 조건이 없으면 중복된 수가 있을 때 무한 루프에 빠짐
		int z = A[i-1];
		A[i-1]= A[j];
		A[j]=z;
		Arrays.sort(A,i,A.length);
		return A;
	}
	static int calculate(int[]A) {
		int res=0;
		for(int i=0;i<A.length-1;i++) {
			int tmp= A[i]-A[i+1];
			if(tmp<0) tmp*=-1;
			res+=tmp;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);//첫 순열
		int max=0;
		do{
			int tmp=calculate(A);
			if(max<tmp) max=tmp;
		}while((A=next_permutation(A))!=null);//모든 순열 탐색
		System.out.println(max);
		sc.close();
	}
}
