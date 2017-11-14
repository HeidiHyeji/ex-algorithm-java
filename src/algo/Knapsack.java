import java.util.ArrayList;
import java.util.Scanner;

public class Knapsack {
	private static int[] select(int[][] DP, int MAX, int[] W) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int K = MAX;                
		for (int i = DP.length - 1; i >= 1; i--) {                                              
			if(K>=0 && DP[i][K] != DP[i-1][K]){
				list.add(i);
				K = K - W[i];
			}
		}
		int[] a = new int[list.size()];            
		for (int i = 0; i < a.length; i++) {
			a[i] = list.get(i);
		}

		return a;
	}
	private static int knapack_bottomup(int N, int W, int[] wt, int[] val, int[][] V) {
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if ((wt[i] <= j) && (V[i - 1][j] < val[i] + V[i - 1][j - wt[i]])) {
					V[i][j] = val[i] + V[i - 1][j - wt[i]];
				} else {
					V[i][j] = V[i - 1][j];
				}
			}
		}
		return V[N][W];
	}

	private static int[] getMaxItems(int N, int MAX, int[] W, int[]V) {
		int[][] DP = new int[N + 1][MAX + 1];         
		knapack_bottomup(N, MAX, W, V, DP);
		return select(DP, MAX, W);
	}

	private static void printList(int[] list, int[] wt, int[] val) {
		StringBuffer sb = new StringBuffer();
		long totalWeight = 0;
		long totalValue = 0;
		for (int i = list.length-1 ; i >= 0; i--) {
			sb.append(list[i] + " ");
			totalWeight += wt[list[i]];
			totalValue += val[list[i]];
		}

		System.out.println("선택 index:" + sb.toString());
		System.out.println("Max Weight:" + totalWeight);
		System.out.println("Max Value:" + totalValue);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("집 개수 N = ");
		int N = sc.nextInt();
		int[] W = new int [N+1];
		int[] V = new int [N+1];
		System.out.print("최대 무게값 MAX = ");
		int MAX = sc.nextInt();
		System.out.print("n개 짐의 무게 = ");
		for(int i = 0 ; i < N ; i++){
			W[i] = sc.nextInt();
		}
		System.out.print("n개 짐의 가치 = ");
		for(int i = 0 ; i < N ; i++){
			V[i] = sc.nextInt();
		}
		long startTime = System.currentTimeMillis();
		//
		int[] list = getMaxItems(N, MAX, W, V);
		printList(list, W, V);
		//
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간(초.0f) : "+ ( endTime - startTime )/1000.0f +"초");
	}
}
