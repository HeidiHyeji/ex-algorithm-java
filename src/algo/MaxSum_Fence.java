import java.util.Scanner;

public class MaxSum_Fence {
	private int max_Fence(int[] arr) {
	    int N = arr.length;
	    int ret = 0;
	    int psum = 0;
	    for (int i = 0; i < N; i++) {
	        psum = Math.max(psum, 0) + arr[i];
	        ret = Math.max(psum, ret);
	    }
	    return ret;
	 
	}
	public static void main(String [] args){
		MaxSum_Fence mf = new MaxSum_Fence();
		Scanner sc = new Scanner(System.in);
		System.out.print("울타리 개수:");
		int[]array = new int[sc.nextInt()]; 
		System.out.print("높이 입력:");
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
		int max=mf.max_Fence(array);
		System.out.print("Max = "+max);
		sc.close();
	}
}
