package algorithm;

public class Binary {

	public static void main(String[] args) {
		//인접행렬 선언
		int matrix[][] = new int[3][3];
		
		//인접행렬 초기화
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = 0;
			}
		}
		
		//대역폭 거리 비교
		int tot = 0; 
		int etot = 0;
		
		//대역폭 비교
		int cnt = 0;
		int ecnt = 0;
		
		
		//edge 넣기
		matrix[0][1] = 2;
		matrix[1][0] = 2;
		matrix[1][2] = 3;
		matrix[2][1] = 3;
		matrix[0][2] = 1;
		matrix[2][0] = 1;
		
		//1,3으로  경로가 주어 졋을때
		int start=1;
		int end=3;
		
		for(int i=0;i<3&&i!=start;i++) {
			if(matrix[start][i]!=0) {
				goroad();
			}
		}
		
 		
		
	}


}
