package BruteforceSearch1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
public class Puzzle1525 {
	static int arrToNum(int[] arr) {
		String s="";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] tmp=new int[9];
		for(int i=0;i<9;i++) {
			tmp[i]=sc.nextInt();
			if(tmp[i]==0) {
				tmp[i]=9;
			}
		}
		int[] dx = {-1,+1,0,0};
		int[] dy = {0,0,-1,+1};
		int start=arrToNum(tmp);
		Queue<Integer> q = new LinkedList<Integer>();
		Map<Integer,Integer> d =new HashMap<Integer,Integer>();//수열,거리
		q.add(start);
		d.put(start, 0);
		while(!q.isEmpty()) {
			int now = q.poll();
			int z=String.valueOf(now).indexOf('9');

			int x=z/3;
			int y=z%3;
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(nx>=0 && nx<3 && ny>=0 && ny<3) {
					String s=String.valueOf(now);
					char c=s.charAt(nx*3+ny);
					s=s.replace('9', '0');
					s=s.replace(c, '9');
					s=s.replace('0', c);
					int next=Integer.parseInt(s);
					if(d.get(next)==null) {
						d.put(next, d.get(now)+1);
						q.add(next);
					}					
				}
			}
		}
		if(d.get(123456789)==null) { //이 부분 작성하지 않으면 런타임 에러 발생함!!
			System.out.println(-1);
		}else {
			System.out.println(d.get(123456789));
		}		
	}
}
