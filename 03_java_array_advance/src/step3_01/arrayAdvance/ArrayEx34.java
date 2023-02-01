package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = var1; //데이터를 대입
		
		var1 = 7;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println();
		
		int[] arr = {87,100,24,11,79};
		int[] temp = arr; // 주소값을 전달.
		
		System.out.println("arr : " + arr);
		System.out.println("temp : " + temp);
		
		
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		arr[4] = 0;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("temp : " + Arrays.toString(temp));

	}

}


