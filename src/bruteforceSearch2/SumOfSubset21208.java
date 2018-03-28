package bruteforceSearch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Ʋ������: ī������int�� �ؼ� long���� �ؾ��Ѵ�!�Է¹����� �����ض�!!
public class SumOfSubset21208 {
	static int N;
	static ArrayList<Long> sup;
	static ArrayList<Long> sdown;
	static Map<Long, Long> cntup;//���� �κ����� ���� ����
	static Map<Long, Long> cntdown;
	static void go(int i,long sum,ArrayList<Long> a,ArrayList<Long> s,Map<Long, Long> cnt) {
		if(i==a.size()) {//�� ����
			s.add(sum);
			if(cnt.get(sum)==null)cnt.put(sum, (long) 0);
			cnt.put(sum, cnt.get(sum)+1);
			return;
		}
		go(i+1,sum,a,s,cnt);
		go(i+1,sum+a.get(i),a,s,cnt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int S = sc.nextInt();
		ArrayList<Long> up=new ArrayList<>();
		ArrayList<Long> down=new ArrayList<>();
		sup=new ArrayList<>();
		sdown=new ArrayList<>();
		cntup=new HashMap<>();
		cntdown=new HashMap<>();
		for(int i=0;i<N/2;i++) {
			up.add(sc.nextLong());
		}
		for(int i=N/2;i<N;i++) {//N�� Ȧ���� downũ�Ⱑ �� ũ��
			down.add(sc.nextLong());
		}
		//�κ������� �� ������ ���ϱ�
		go(0,0,up,sup,cntup);
		go(0,0,down,sdown,cntdown);
		
		//�κ������� �� �����ϱ�
		Long[] tmp = sup.toArray(new Long[sup.size()]);		
		Arrays.sort(tmp);
		sup.clear();
		Collections.addAll(sup, tmp);
		tmp = sdown.toArray(new Long[sdown.size()]);		
		Arrays.sort(tmp);
		sdown.clear();
		Collections.addAll(sdown, tmp);
		
		long maxl=sup.size();long maxr=sdown.size();
		long left=0;long right=maxr-1;long cnt=0;
		Long sum=sup.get(0)+sdown.get((int) (maxr-1));
        while(right<maxr && left<maxl && right>=0 && left>=0) {
			if(sup.get((int) left)+sdown.get((int) right)==S) {
				Long numup=cntup.get(sup.get((int) left));
				Long numdown=cntdown.get(sdown.get((int) right));
				cnt=cnt+numup*numdown;
				left+=numup;
				right-=numdown;
			}else if(sup.get((int) left)+sdown.get((int) right)<S) {
				left++;
			}else {
				right--;
			}

		}
		if(S==0) {
			cnt--;
		}
		System.out.println(cnt);
	}
}