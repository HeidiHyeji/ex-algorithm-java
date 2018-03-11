package BruteforceSearch0;
import java.util.Scanner;

public class Main {
	static void toString(int arr[]) {
		String str="";
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+" "; 
		}
		System.out.print(str.trim());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		boolean flag[] = new boolean[N+1];
		long f[] = new long[N+1];
		/*팩토리얼 배열*/
		f[0]=1;
		for(int i=1;i<N;i++) {
			f[i]=f[i-1]*i;
		}
		
		int num = sc.nextInt();
		switch(num) {
		case 1:
			long k= sc.nextInt();
			for(int i=0;i<N;i++) {
				for(int j=1;j<=N;j++) {
					if(flag[j]) continue;
					if(k>f[N-i-1] && f[N-i-1]!=0 ) {
						k-=f[N-i-1];
						}
					else {
						arr[i]=j;
						flag[j]=true;
						break;
					}
				}				
			}
			toString(arr);
			break;
		case 2:
			long sum=1;//i=N-1일 때, 즉 0!, 자기자신일 때를 미리 셈.
			for(int i=0;i<N;i++) {//배열 초기화
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++) {
				for(int j=1;j<arr[i];j++) {
					if(flag[j]) continue;
					sum+=f[N-i-1];
				}
				flag[arr[i]]=true;
			}
			System.out.println(sum);
			break;
		default:
			break;
		}
	}
}
