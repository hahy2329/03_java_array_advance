package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx35_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int elementCnt = 0;
		
		while(true) {
			System.out.print("[");
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(score[i]);
				if(i != elementCnt-1) {
					System.out.print(",");
				}
			}
			System.out.println("]");
			
			System.out.println("1.추가");
			System.out.println("2.삭제(인덱스를 이용한 삭제)");
			System.out.println("3.삭제(값을 이용한 삭제");
			System.out.println("4.삽입(인덱스와 값을 이용한 삽입)");
			System.out.println("5.종료");
			
			int sel = scan.nextInt();
			
			if(sel == 1) { // 추가 : 값을 이용하여 순차적으로 추가
				System.out.println("값을 입력하세요: ");
				int value = scan.nextInt();
				
				if(elementCnt == 0) {
					score = new int[elementCnt+1];
				}
				
				else if(elementCnt>0) {
					int[] temp = score;
					score = new int[elementCnt+1];
					for (int i = 0; i < elementCnt; i++) {
						score[i] = temp[i];
					}
					temp =null;
				}
				
				score[elementCnt] = value;
				elementCnt ++;
			}
			
			else if(sel == 2) {// 2. 삭제(인덱스) : 인덱스를 입력받아 해당 위치의 값 삭제
				System.out.println("삭제할 인덱스를 선택해주세요: ");
				int index = scan.nextInt();
				
				if (elementCnt < index || index < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if(elementCnt == 1) {
					 score = null;
					 elementCnt = 0;
				 }
				 
				 else if(elementCnt > 1) {
					 int[] temp = score;
					 score = new int[elementCnt -1];
					 
					 int j = 0;
					 for (int i = 0; i < elementCnt; i++) {
						if(i!=index) {
							score[j++] = temp[i];
						}
					}
					temp = null;
					
					 
				 }
				elementCnt--;
				
			}
			
			else if(sel == 3) { // 3. 삭제(값) 값을 입력받아 삭제 # 없는 값 입력 시 예외처리
				 System.out.println("삭제할 값을 입력해주세요 : ");
				 int value = scan.nextInt();

				 int index = -1;
				 for (int i = 0; i < elementCnt; i++) {
					 if(score[i] == value) {
						 index = i;
					 }
				 }
				 
				 if(index == -1) {
					 System.out.println("해당값은 존재하지 않습니다.");
					 continue;
				 }
				 
				 if(elementCnt ==1) {
					 score = null;
				 }
				 
				 else if(elementCnt >1) {
					 int[] temp = score;
					 score = new int[elementCnt -1];
					 int j = 0;
					 
					 
					
					 
					 for (int i = 0; i < elementCnt; i++) {
						if(temp[i] != value) {
							score[j++] = temp[i];
						}
					}
					 temp =  null;
					 
					 
				 }
				 elementCnt --;
				
			}
			
			else if(sel == 4) { // * 4. 삽입 : 인덱스와 값을 입력받아 삽입
				 System.out.println(" 삽입할 인덱스를 입력해주세요: ");
				 int index = scan.nextInt();
				 
				 System.out.println("인덱스에 삽입할 값을 입력해주세요: ");
				 int value = scan.nextInt();
				 
				 if (elementCnt < index || index < 0) {
						System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
						continue;
					}
				 
				 
				 if(elementCnt == 0) {
					 score = new int[elementCnt+1];
				 }
				 
				 else if(elementCnt> 0) {
					 int[] temp = score;
					 score = new int[elementCnt +1 ];
					 
					 int j =0;
					 
					 for (int i = 0; i < elementCnt+1; i++) {
						if(i != index) {
							score[i] =temp[j++];
						}
					}
					temp = null; 
					 
				 }
				 
				 score[index] = value;
				 elementCnt++;
				 
				 
				
			}
			
			else if(sel==5) {
				break;
			}
			
			
			
			
			
		}
		
		
		 
		
		

   }
}