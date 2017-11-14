import java.util.Scanner;

public class LCS {
	
	private static int lcs(String A, String B){
		int[][] DP = new int[A.length()+1][B.length()+1];
		for(int i =1 ; i < DP.length; i++){
			for(int j=1; j < DP[i].length; j++){
				if(A.charAt(i-1)==B.charAt(j-1)){
					DP[i][j]= DP[i-1][j-1]+1;
				}
				else DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
			}
		}
		return DP[A.length()][B.length()];
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		long startTime = System.currentTimeMillis();
		int result = lcs(A,B);
		long endTime = System.currentTimeMillis();
		System.out.println("최대 개수"+result);
		System.out.print("소요시간(초.0f) : "+ ( endTime - startTime )/1000.0f +"초");
	}
}
