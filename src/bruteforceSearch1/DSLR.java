package bruteforceSearch1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class DSLR {
	static int MAX=10000;
	static int d(int num) {
		num=(2*num)%10000;
		return num;
	}
	static int s(int num) {
		if(num==0) {
			num=9999;
		}else {
			num--;
		}
		return num;
	}
	static int l(int num) {
		return (num%1000)*10+(num/1000);
	}
	static int r(int num) {
		return (num%10)*1000+(num/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		String[] how =new String[4];
		how[0]="D";
		how[1]="S";
		how[2]="L";
		how[3]="R";
		for(int testcase=0;testcase<T;testcase++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			Queue<Integer> q = new LinkedList<Integer>();
			boolean[] visited=new boolean[MAX];
			String[] dist = new String[MAX];
			int[] nodes =new int[4];

			q.add(A);
			visited[A]=true;
			dist[A]="";
			while(!q.isEmpty()){
				int now=q.poll();
				nodes[0]=d(now);
				nodes[1]=s(now);
				nodes[2]=l(now);
				nodes[3]=r(now);
				for(int i=0;i<nodes.length;i++) {
					if(visited[nodes[i]]!=true) {
						visited[nodes[i]]=true;
						dist[nodes[i]]=dist[now]+how[i];
						q.add(nodes[i]);
					}
				}
			}
			System.out.println(dist[B]);
		}
	}
}
