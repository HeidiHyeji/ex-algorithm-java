import java.util.Scanner;

public class Max_Array {
	//���� ��ȹ�� �̿��ϱ�
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
		System.out.print("�迭 ����:");
		int[]array = new int[sc.nextInt()]; 
		System.out.print("�� �Է�:");
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
		//���۽ð�
		long startTime = System.currentTimeMillis();
		int max=ma.max_SubArray(array);
		System.out.println("Max = "+max);
		sc.close();
		//����ð�
		long endTime = System.currentTimeMillis();
		System.out.print("�ҿ�ð�(��.0f) : "+ ( endTime - startTime )/1000.0f +"��");
	}
}
