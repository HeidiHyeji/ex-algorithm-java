import java.util.Scanner;

public class Max_Array {
	//동적 계획법 이용하기
	private int max_SubArray(int[] arr) {
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
		
		
		Max_Array ma = new Max_Array();
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 개수:");
		int[]array = new int[sc.nextInt()]; 
		System.out.print("수 입력:");
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
		//시작시간
		long startTime = System.currentTimeMillis();
		int max=ma.max_SubArray(array);
		System.out.println("Max = "+max);
		sc.close();
		//동료시간
		long endTime = System.currentTimeMillis();
		System.out.print("소요시간(초.0f) : "+ ( endTime - startTime )/1000.0f +"초");
	}
}
