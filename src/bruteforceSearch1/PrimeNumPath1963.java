package bruteforceSearch1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//�����佺�׳׽��� ü  http://marobiana.tistory.com/91
public class PrimeNumPath1963 {
	static int MAX=10000;
	static int[] pn = new int[MAX];
	
	static void init() {//���� 0�� �ƴϸ� �Ҽ�
		for(int i=0;i<MAX;i++) {
			pn[i]=i;
		}
		for(int i=2;i*i<=MAX-1;i++) {
			if(pn[i]==0) {
				continue;
			}
			for(int j=i+i;j<=MAX-1;j+=i) {
				pn[j]=0;
			}
		}
	}
	static int change(int num,int idx,int digit) {
		if(idx==0 && digit==0) return -1;
		int[] arr= new int[4];
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]=num%10;
			num/=10;
		}
		arr[idx]=digit;
		String s="";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		init();
		for(int t=0;t<T;t++) {
			int A =sc.nextInt();
			int B = sc.nextInt();
			
			Queue<Integer> q = new LinkedList<Integer>();
			boolean[] check=new boolean[MAX];
			int[] dist= new int[MAX];
			q.add(A);
			check[A]=true;
			dist[A]=0;
			while(!q.isEmpty()) {//BFS
				int now=q.poll();
				for(int i=0;i<4;i++) {
					for(int j=0;j<=9;j++) {
						int next=change(now,i,j);
						if(next!=-1 && check[next]!=true && pn[next]!=0) {//�ڸ��� �ϳ��� ���������� ���� &�湮��������&�Ҽ�
							q.add(next);
							check[next]=true;
							dist[next]=dist[now]+1;
						}
					}
				}
			}
			System.out.println(dist[B]);
		}
	}
}
