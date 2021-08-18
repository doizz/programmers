package programmers;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 x만큼 간격이 있는 n개의 숫자
	 */
public class programmers_44 {

	public static void main(String[] args) {
		
		int x = -4;
		int n = 2;
		//주어진수의 더한값을 저장할 변수를 선언한다.(보기에 int형을 넘는 숫자까지 제시되었으므로 long형으로선언)
		long sum=0;
		//리턴할 변수를 선언한다.
		long[] answer = new long[n];
		//반복문을 통해 주어진수를 더하는값을 배열에 저장한다.
		for(int i=0 ; i<n ; i++) {
			sum +=x;
			answer[i] = sum;
		}
		//값을 리턴한다.
		System.out.println(Arrays.toString(answer));
	}

}
