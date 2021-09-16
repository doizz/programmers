package programmers_level_1;

import java.util.Arrays;

public class programmers_10 {

	public static void main(String[] args) {

//		int[] lottos = {45, 4, 35, 20, 3, 9};
//		int[] nums = {20, 9, 3, 45, 4, 35};
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] nums = {31, 10, 45, 1, 6, 19};
//		Arrays.sort(lottos);
//		Arrays.sort(nums);
		
		int rowCnt=0,maxCnt = 0;
		for(int i=0 ; i<lottos.length ; i++) {
			for(int j=0 ; j<nums.length ; j++) {
				if(lottos[i] == nums[j]) {
					lottos[i] = -1;
					nums[j] = -1;
					rowCnt++;
				}
			}
		}
		System.out.println(rowCnt);
		Arrays.sort(lottos);
		Arrays.sort(nums);
		for(int i =0 ; i<lottos.length ; i++) {
			if(lottos[i] == 0) {
				lottos[i]=nums[i];
				maxCnt++;
			}
		}
		maxCnt = lottosCnt(rowCnt+maxCnt);
		rowCnt = lottosCnt(rowCnt);
		int[] answer = new int[]{maxCnt,rowCnt};
		System.out.println(Arrays.toString(answer));
	}
	
	public static int lottosCnt(int num) {
		switch(num){
			case 2:
				return 5;
			case 3:
				return 4;
			case 4:
				return 3;
			case 5:
				return 2;
			case 6:
				return 1;
			default :
				return 6;
		}
	}

}
