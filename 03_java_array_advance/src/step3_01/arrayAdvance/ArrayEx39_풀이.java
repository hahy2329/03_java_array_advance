package step3_01.arrayAdvance;



/*
 *	# 2차원배열 기본문제[3단계]
*/
//23.02.02 12:40 ~ 12:58
public class ArrayEx39_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		/*
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				if(i==0) {
					if(j==0 || j==1||j==2||j==3) {
						sum +=arr[i][j];
					}
				}
				else if(i==1) {
					if(j==0 || j==1||j==2||j==3) {
						sum2 +=arr[i][j];
					}
				}
				
				else if(i==2) {
					if(j==0 || j==1||j==2||j==3) {
						sum3 +=arr[i][j];
					}
				}
			}
		}
		
		System.out.println("가로합 출력 ");
		System.out.println("1행 : " + sum);
		System.out.println("2행 : " + sum2);
		System.out.println("3행 : " + sum3);
		*/
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		
		
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				if(i==0 || i==1 || i==2) {
					if(j==0) {
						sum4 += arr[i][j];
					}
				}
				
				if(i==0 || i==1 || i==2) {
					if(j==1) {
						sum5 += arr[i][j];
					}
				}
				
				if(i==0 || i==1 || i==2) {
					if(j==2) {
						sum6 += arr[i][j];
					}
				}
				
				if(i==0 || i==1 || i==2) {
					if(j==3) {
						sum7 += arr[i][j];
					}
				}
			}
		}
		
		System.out.println("세로합 출력 ");
		System.out.println("1열 : "+ sum4);
		System.out.println("2열 : "+ sum5);
		System.out.println("3열 : "+ sum6);
		System.out.println("4열 : "+ sum7);
		
		
		



	}

}
