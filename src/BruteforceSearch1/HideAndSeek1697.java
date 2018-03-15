package BruteforceSearch1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class HideAndSeek1697 {
	static int MAX=200000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int K = sc.nextInt(); 
		boolean[] check=new boolean[MAX];
		int[] dist= new int[MAX];
		int[] cal = new int[3];
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(N);
		check[N]=true;
		dist[N]=0;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			cal[0]=now-1;
			cal[1]=now+1;
			cal[2]=now*2;
			for(int i=0;i<cal.length;i++) {
				if(cal[i]>=0 && cal[i]<MAX) {
					if(check[cal[i]]!=true) {
						q.offer(cal[i]);
						check[cal[i]]=true;
						dist[cal[i]] = dist[now]+1;
					}
				}
			}

		}
		System.out.println(dist[K]);
		sc.close();
	}
}
