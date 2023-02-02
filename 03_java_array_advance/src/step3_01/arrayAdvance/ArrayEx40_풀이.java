package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 관리비
*/
//23.02.02 13:40 ~ 14:02
public class ArrayEx40_풀이 {

	public static void main(String[] args) {
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		/*
		int sum =0;
		int sum1 = 0;
		int sum2 =0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(i ==0) {
					if(j==0||j==1||j==2) {
						sum+=pay[i][j];
					}
				}
				
				else if(i==1) {
					if(j==0||j==1||j==2) {
						sum1 += pay[i][j];
					}
				}
				
				else if(i==2) {
					if(j==0||j==1||j==2) {
						sum2 += pay[i][j];
					}
				}
			}
		}
		
		System.out.println("각 층별 관리비 합: ");
		System.out.println("1층 : "+ sum);
		System.out.println("2층 : " + sum1);
		System.out.println("3층 : " + sum2);
		*/
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("호수를 입력해주세요: ");
		int room = scan.nextInt();
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(apt[i][j] == room) {
					System.out.println(apt[i][j]+"호의 관리비 :" + pay[i][j]+"원 입니다.");
				}
			}
		}
		*/
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		/*
		int minNum = 0;
		int maxNum = 0;
		int minRoom =0;
		int maxRoom2 =0;
		
		//1. 관리비가 가장 적게 나온 집 구하기.
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(i==0&&j==0) {
					minNum = pay[i][j];
					minRoom = apt[i][j];
				}
				
				else if(minNum>pay[i][j]) {
					minNum = pay[i][j];
					minRoom = apt[i][j];
				}
			}
		}
		
		
		//2. 관리비가 가장 많게 나온 집 구하기 
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(maxNum <pay[i][j]) {
					maxNum = pay[i][j];
					maxRoom2 = apt[i][j];
				}
			}
			
		}
		
		//3. 최종결과 출력하기
		
		System.out.println("가장 관리비가 적게 나온 호수는 "+ minRoom+"호 이고, 금액은 "+ minNum+"원 입니다.");
		System.out.println("가장 관리비가 많이 나온 호수는 "+ maxRoom2+"호 이고, 금액은 "+ maxNum+"원 입니다.");
		
		
		
		*/
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		
		//기존 호수에 따른 관리비 
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(apt[i][j]+": " +pay[i][j]+"원 ");
			}
			System.out.println();
		}
		
		System.out.print("호수를 입력해주세요: ");
		int room = scan.nextInt();
		System.out.println();
		
		System.out.print("호수를 입력해주세요: ");
		int room2 = scan.nextInt();
		System.out.println();
		
		int temp = 0;
		int temp2 = 0;
		
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(apt[i][j]==room) {
					count5 = i;
					count6 = j;
				}
				
				else if(apt[i][j]==room2) {
					count7 = i;
					count8 = j;
				}
			}
		}
		
		temp = pay[count5][count6];
		pay[count5][count6] = pay[count7][count8];
		pay[count7][count8] = temp;
		
		//관리비 교체 된 후 최종 출력
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(apt[i][j]+": " +pay[i][j]+"원 ");
			}
			System.out.println();
		}
		
		
		

	}

}
