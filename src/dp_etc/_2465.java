package dp_etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> x=new ArrayList<Integer>();
		int[] s = new int[N+1];
		int[] d = new int[N+1];
		for(int i=1;i<=N;i++) {
			x.add(sc.nextInt());
		}
		Collections.sort(x);
		for(int i=0;i<=N-1;i++) {
			s[i]=sc.nextInt();
		}
		for(int i=N-1;i>=0;i--) {
			d[i]=x.get(s[i]);
			x.remove(s[i]);
		}
		for(int i=0;i<=N-1;i++) {
			System.out.println(d[i]);
		}
	}
}