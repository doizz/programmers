package programmers;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 제일 작은수 제거하기
	 */
public class programmers_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,6,4,1,3};
		//배열의 길이가 1일경우 -1를 리턴한다.
		 if(arr.length == 1) 
			 System.out.println(-1);
	        
	        int minidx = 0;        
	        //배열의 길이만큼 for문을 돌린다.
	        for(int i=0; i<arr.length; i++) {
	        	//배열의 다음수와 비교하여 작으면 해당하는 인덱스를 변수에 저장한다.
	            if(arr[minidx] > arr[i]) {
	                    minidx = i;
	            }
	        }
	        
	        //배열은 제일작은수를 제외해야하니 기존의 배열길이에서 -1을하여 선언한다.
	        int[] answer = new int[arr.length-1];
	        int cnt = 0;
	        //배열의 길이만큼 for문을 돌린다.
	        for(int i=0; i<arr.length; i++) {
	        	//이전 for문에서 구했던 가장 작은수가 있는 배열의 인덱스는 continue한다.
	            if(i == minidx) continue;
	            //배열의 가장작은수를 제외한 나머지 수는 배열에 대입한다.
	            answer[cnt++] = arr[i];
	        }
	        //제일작은수를제외한 배열을 리턴한다.
	        System.out.println(Arrays.toString(answer));
	}

}
