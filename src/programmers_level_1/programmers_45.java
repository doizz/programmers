package programmers_level_1;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 행렬의 덧셈
	 */
public class programmers_45 {

	public static void main(String[] args) {
		int[][] arr = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		//리턴할 변수의 배열의 크기를 지정한다.
		int[][] answer = new int[arr.length][arr[0].length];
		
		//이중 for문을 사용하여 배열의 값을 넣어준다.
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				//주어진 배열의 행열의 값을 더한 값을 리턴할 변수에 넣어준다.
				answer[i][j] = arr[i][j]+arr2[i][j];
			}
		}
		//값을 리턴한다.
		System.out.println(Arrays.deepToString(answer));
	}

}
