package programmers;

import java.util.Arrays;

public class programmers_18 {
	/*
	 * 프로그래머스 LEVEL_1 1차 비밀지도
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int[] arr1= {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		//배열의 길이만큼 반환할 변수의 크기를 선언한다.
		String[] answer= new String[n];
        for(int i = 0; i < n; i++) {
        	//toBinaryString() 메소드를사용하여 비트연산을 수행한다.
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%"+n+"s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        	}
        
		System.out.println(Arrays.toString(answer));
	}

}
