package programmers_level_1;

import java.util.*;
public class programmers_4 {

		/*
		 * 프로그래머스 LEVEL_1 폰켓몬 갯수 구하기
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//폰켓몬 종류에 따른 숫자를 배열로 받는다.
		int[] nums = {3,3,3,2,2,4};
		
		
		//가지고 갈수 있는 포켓몬의 갯수는 nums의 반이다
		int getPok = nums.length/2;
		int kinds = 0;
		//HasSet을 이용하여 중복없이 폰켓몬의 갯수를 정한다.
		HashSet<Integer> pokSet = new HashSet<Integer>();
		for(int num : nums) {
			pokSet.add(num);
		}
		
		//폰켓몬이 몇마리인지 그 사이즈를 종류 변수에 넣는다.
		kinds = pokSet.size();
		
		//가지고 갈수있는폰켓몬의 갯수가 종류보다 더 크거나 같은경우 종류 변수의 값을 리턴시킨다.
		if(kinds <= getPok) {
			System.out.println(kinds);
		} else {
		//가지고 갈수 있는 폰켓몬의 갯수가 종류보다 작을시에는 폰켓몬의 갯수를 리턴시킨다.
			System.out.println(getPok);
		}
	}

}
