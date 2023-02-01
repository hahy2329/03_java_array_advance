package step3_01.arrayAdvance;


//2차원 배열 

public class ArrayEx36 {

	public static void main(String[] args) {
		int[][] arr = new int[2][4]; //4칸짜리가 2줄있다. 
		
		arr[0][0] = 10; //0행 0번째
		arr[0][1] = 20; // 0행 1번째
		arr[0][2] = 30; // 0행 2번째
		arr[0][3] = 40; // 0행 3번째
		
		// 10, 20, 30, 40
		
		arr[1][0] = 50; // 1행 0번째
		arr[1][1] = 60; // 1번째
		arr[1][2] = 70; // 2번째
		arr[1][3] = 80; // 3번째
		
		// 50, 60, 70, 80
		
		System.out.println("arr : " + arr); //arr은 arr0행과 arr1행을 가리키는 대표 주소
		System.out.println("arr[0] :" + arr[0]); // arr0행은 arr0행을 가리키는 대표 주소
		System.out.println("arr[1] : "+ arr[1]); // arr1행은 arr1행을 가리키는 대표 주소
		System.out.println();
		
		System.out.println("arr[0][0] : " + arr[0][0]); // 데이터
		System.out.println("arr[0][1] : " + arr[0][1]); // 데이터
		System.out.println("arr[0][2] : " + arr[0][2]); // 데이터
		System.out.println("arr[0][3] : " + arr[0][3]); // 데이터
		System.out.println();
		
		System.out.println("arr[1][0] : " + arr[1][0]); // 데이터
		System.out.println("arr[1][1] : " + arr[1][1]); // 데이터
		System.out.println("arr[1][2] : " + arr[1][2]); // 데이터
		System.out.println("arr[1][3] : " + arr[1][3]); // 데이터
		System.out.println();
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("arr.length : " + arr.length); // 행을 길이를 말함. 즉, 2
		System.out.println(arr[0].length); // 가로 한 줄의 길이 즉, 4
		System.out.println(arr[1].length); // 가로 한 줄의 길이 즉, 4
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { //arr[i].length의 i는 i가 0일때 0번째의 가로 한 줄 길이4 
													  //arr[i].length의 i는 i가 1일때 1번째의 가로 한 줄 길이4	
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		//생각해보기
		
		// ?? temp1 = arr;   // 주소 or 데이터  : 
		// ?? temp2 = arr[0]; // 주소 or 데이터 : 
		// ?? temp3 = arr[1]; // 주소 or 데이터 : 
		// ?? temp4 = {arr[0][0]}; // 주소 or 데이터 :
		// ?? temp5 = {arr[1][1]}; // 주소 or 데이터 : 
		
		
		
		int[][] temp1 = arr;   // 주소 or 데이터  : 주소를 나타냄
		int[] temp2 = arr[0]; // 주소 or 데이터 : 주소를 나타냄
		int[] temp3 = arr[1]; // 주소 or 데이터 : 주소를 나타냄
		int[] temp4 = {arr[0][0]}; // 주소 or 데이터 : 데이터
		int[] temp5 = {arr[1][1]}; // 주소 or 데이터 : 데이터 
		
	
		
		
		
		
			
		

	}

}
