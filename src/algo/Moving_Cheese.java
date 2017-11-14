import java.util.Scanner;

public class Moving_Cheese {
	int load(int n, int [][] cheese, int [][]max){
		for(int i=1; i<=n; i++){
			for(int j =1; j<=n; j++){
				//공통부 이전 max값 비교
				if(max[i-1][j]< max[i][j-1])
					max[i][j]=max[i][j-1];
				else
					max[i][j]=max[i-1][j];
				//치즈있으면 +1
				if(cheese[i][j]==1){
					max[i][j]++;
				}
			}
		}
		return max[n][n];
	}
	public static void main(String [] args){
		 Moving_Cheese mc = new  Moving_Cheese();
		 Scanner s = new Scanner(System.in);
		 int N = s.nextInt();//배열크기 N*N
		 int M = s.nextInt();//치즈 개수
		 int [][] cheese = new int[N+1][N+1];
		 int [][] max = new int[N+1][N+1];
		 //치즈는 +1이라 생각(boolean타입 으로 하여 true면 +1인것으로 해도 됨)
		 for(int i=0; i<M; i++){
			 cheese[s.nextInt()][s.nextInt()]=1;
		 }
		//시작시간
		long startTime = System.currentTimeMillis();
		 int result = mc.load(N,cheese,max);
		 System.out.println("최대 치즈 개 수 :"+result);
		 s.close();
		//동료시간
		long endTime = System.currentTimeMillis();
		System.out.print("소요시간(초.0f) : "+ ( endTime - startTime )/1000.0f +"초");
	}
}
