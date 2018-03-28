package bruteforceSearch0;
import java.util.Scanner;
public class PrevPermutaion10973 {
	static String toString(int[] arr) {
		String str="";
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+" ";
		}
		return str.trim();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {//배열 초기화
			arr[i]=sc.nextInt();
		}
		int idx = N-1;
		while(idx>=1 && arr[idx-1]<=arr[idx]) idx--;
		if(idx == 0) {
			System.out.println(-1);
		}else {
			int prev = N-1;
			while(prev>=idx && arr[idx-1]<=arr[prev]) prev--;
			int z = arr[idx-1]; //swap
			arr[idx-1] = arr[prev];
			arr[prev] = z;
			//내림 차순 버블 정렬
			for (int i = idx; i < N; i++) {
	            for (int j = i + 1; j < N; j++) {
	                if (arr[i] < arr[j]) {
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	        }
			System.out.println(toString(arr));
		}
	}
}
