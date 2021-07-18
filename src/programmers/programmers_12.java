package programmers;

import java.util.Arrays;
/*
 * 프로그래머스 LEVEL_1 예산
 */
public class programmers_12 {
	//문제를 읽었을때 접근하는 방식을 어렵게 생각하면 어려운문제.
	//쉽게 접근해서 풀려고하면 쉬운 문제인거같다.
	//예산에서 신청한 부서의 금액을 빼서 카운트를 구하는게 제일 최적화된 방법인거같다.
	public static void main(String[] args) {

//		int[] d= {1,3,2,5,4};
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer =0;
		//배열에 정렬시켜준다.
		Arrays.sort(d);
		
		//배열의 길이만큼 for문을 돌려준다.
		for(int i = 0 ; i < d.length ; i++) {
			//예산에서 각 부서별로 신청한 금액을 빼준다.
			budget -= d[i];
			//예산이 0보다 작을경우 포문을 빠져나온다.
			if(budget < 0) {
				break;
			}
			//예산에서 각 부서별로 신청한금액을 뺏을때 예산이 남으면 카운트를 증가시켜준다.
			answer++;
		}
		System.out.println(answer);
	}

}
