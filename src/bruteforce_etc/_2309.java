package bruteforce_etc;

import java.util.Arrays;
import java.util.Scanner;

public class _2309 {
	final static int num=9;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[num];
		int sum=0;
		for(int i=0;i<num;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		Arrays.sort(a);
		int m1 = 0,m2=0;
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {//선택된 두 난쟁이의 키만 뺀다
				if(sum-a[i]-a[j]==100) {
					m1=i;m2=j;
					break;
				}
			}
		}
		for(int i=0;i<num;i++) {
			if(i==m1 || i==m2) continue;
			System.out.println(a[i]);
		}
		
	}

}
