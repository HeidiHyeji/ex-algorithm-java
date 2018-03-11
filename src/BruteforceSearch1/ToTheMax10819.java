package BruteforceSearch1;
import java.util.Arrays;
import java.util.Scanner;
public class ToTheMax10819 {
	static int[] next_permutation(int[]A) {
		int i=A.length-1;
		while(i>0 && A[i-1]>=A[i]) i--;//���ٴ� ������ ������ �ߺ��� ���� ���� �� ���� ������ ����
		if(i<=0) return null;//������ ������ ���
		int j=A.length-1;
		while(j>=i && A[i-1]>=A[j]) j--;//���ٴ� ������ ������ �ߺ��� ���� ���� �� ���� ������ ����
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
		Arrays.sort(A);//ù ����
		int max=0;
		do{
			int tmp=calculate(A);
			if(max<tmp) max=tmp;
		}while((A=next_permutation(A))!=null);//��� ���� Ž��
		System.out.println(max);
		sc.close();
	}
}
