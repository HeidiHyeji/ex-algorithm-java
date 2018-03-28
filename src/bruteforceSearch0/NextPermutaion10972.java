package bruteforceSearch0;
import java.util.Scanner;
import java.util.Arrays;
public class NextPermutaion10972 {
	static String toString(int arr[]) {
		String str = "";
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+" ";
		}
		return str.trim();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {//배열 초기화
			arr[i]=sc.nextInt();
		}
		int idx=N-1;
		
		while(idx>=1 && arr[idx-1]>=arr[idx]) idx--;
		if(idx == 0) { 
			System.out.println(-1);
		}
		else {
			int next = N-1;
			while(next>=idx && arr[next] <= arr[idx-1]) next--;
			
			int z = arr[idx-1]; //swap
			arr[idx-1] = arr[next];
			arr[next] = z;
			Arrays.sort(arr, idx, N); //idx부터 N전까지 오름차순 정렬
			System.out.println(toString(arr));
		}
		sc.close();
		//시간복잡도 O(N)
	}
}
