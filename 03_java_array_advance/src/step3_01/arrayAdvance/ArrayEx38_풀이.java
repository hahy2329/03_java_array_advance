package step3_01.arrayAdvance;



import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/
//23.02.02 12:26 ~ 12:40
public class ArrayEx38_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("인덱스1을 입력하세요: ");
		int user1 = scan.nextInt();
		System.out.println();
		

		System.out.print("인덱스2를 입력하세요: ");
		int user2 = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == user1 && j==user2) {
					System.out.println(arr[i][j]);
				}
				
				
			}
		}
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.print("값을 입력해주세요: ");
		int user3 = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==user3) {
					System.out.println("인덱스1 출력: " + i +"인덱스2 출력: " + j);
				}
			}
		}
		System.out.println();
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		int maxNum =0;
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>maxNum) {
					maxNum = arr[i][j];
					idx1 = i;
					idx2 = j;
					
					
				}
			}
		}
		
		System.out.println("가장 큰값의 인덱스1: " + idx1 + " 인덱스2: " + idx2+"입니다.");
		System.out.println();
		*/
		// 문제 4) 값 2개를 입력받아 값 교체
		
		// 원래의 arr배열에 들어있는 요소값들
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// 두 개의 값 입력 
		
		System.out.print("값을 입력하세요: ");
		int userNum3 = scan.nextInt();
		System.out.println();
		
		System.out.print("갑을 입력하세요2: ");
		int userNum4 = scan.nextInt();
		System.out.println();
		
		int storeIdx1 =0;
		int storeIdx2 = 0;
		int storeIdx3 = 0;
		int storeIdx4 = 0;
		
		
		
		
		
		// 입력한 2개의 값을 변경시도 작업
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==userNum3) {
					storeIdx1 = i;
					storeIdx2 = j;
				}
				
				else if(arr[i][j]==userNum4) {
					storeIdx3 = i;
					storeIdx4 = j;
				}
			}
		}
		
		int temp=0;
		
		temp = arr[storeIdx1][storeIdx2];
		arr[storeIdx1][storeIdx2] = arr[storeIdx3][storeIdx4];
		arr[storeIdx3][storeIdx4] = temp;
		
		//바뀌고 난 뒤의 요소 값들 출력 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		




	}

}
