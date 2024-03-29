package step3_01.arrayAdvance;

/*
 *	# 2차원배열 기본문제[1단계]
*/

//23.02.02 12:20 ~ 12:25
public class ArrayEx37_풀이 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int sum = 0;
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;

				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println("전체 합은 " + sum+"입니다.");
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		int sum1=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					sum1 += arr[i][j];
				}
			}
		}
		
		System.out.println("합 :" + sum1);
		
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		int count =0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]%4==0) {
					count++;
				}
			}
		}
		
		System.out.println("4의 배수의 개수 : " + count);



	}

}
