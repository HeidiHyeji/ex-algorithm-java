package bruteforceSearch2;
import java.util.Scanner;
public class SumOfNumber22003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a=new int[N+1];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int left=0;int right=0;
		int sum=a[0];
		int ans=0;
		while(left<=right && right<N) {
			if(sum<M) {
				right++;
				sum+=a[right];
			}else if(sum==M) {
				ans++;
				right++;
				sum+=a[right];
			}else if(sum>M) {
				sum-=a[left];
				left++;
				if(left>right && left<N) {
					right=left;
					sum=a[left];
				}
			}
		}
		System.out.println(ans);
	}

}
