package step3_01.arrayAdvance;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class ArrayEx41_소스분석 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] ladder= {  // ladder의 배열의 크기는[9][5] 5칸짜리가 9줄로 이루어짐
				{0,0,0,0,0}, 
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}
		};
		
		int x = 0; // x좌표
		int y = 0; // y좌표
		
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {		// 특수문자 : ㅂ + 한자
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");    // 해당요소가 0일 경우 │ 출력
				}
				else if (ladder[i][j] == 1) {	
					if (j != 0 && ladder[i][j-1] == 1) {
						System.out.print("─┤ "); 
						//1,1이면 해당 요소가 1인데, && 1,0도(그 전에 값) 1이면 서로를 이어주는 ┤출력 
					}
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){
						System.out.print(" ├─");
						//j가 세로 줄의 끝인 4와 같지 않으면서 해당 요소의 다음 값이 1이면 서로를 이어주는 ├ 출력
					}
				}
			}
			System.out.println(); // 하나의 행의 for문이 끝나면 한 줄 띄기
		}

		System.out.print("0~4 입력 : ");
		x = scan.nextInt(); 
		//밑은 for문 부터는 y는 행 x는 열 
		
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) {
				y++;
			}
			else if (ladder[y][x] == 1) {
				if (x != 0 && ladder[y][x-1] == 1) {// 한칸 내려가서 왼쪽으로 이동하는 if문
					x--; 
				}
				else if(x != 4 && ladder[y][x+1] == 1) { // 한칸 내려가서 오른쪽으로 이동하는 if문
					x++;  
				}
				y++;
			}
		}
		
		System.out.println("x = " + x);
		//System.out.println("y = " + y);

		scan.close();

	}

}

//소스 분석이 끝나면 1.따라쳐보고, 2. 스스로 해보기 
