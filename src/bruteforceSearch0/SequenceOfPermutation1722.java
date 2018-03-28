package bruteforceSearch0;

import java.util.Scanner;
public class SequenceOfPermutation1722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = sc.nextInt();//문제 번호
		long f[] = new long[N+1];
		int arr[] = new int[N];
		boolean flag[] = new boolean[N+1];
		
		/*팩토리얼 배열*/
		f[0]=1;
		for(int i=1;i<N;i++) {
			f[i]=f[i-1]*i;
		}
		
		switch(num) {
		case 1:
			long k= sc.nextLong();
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
			String str="";
			for(int i=0;i<arr.length;i++) {
				str+=arr[i]+" "; 
			}
			System.out.print(str.trim());
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
	sc.close();
	}
}