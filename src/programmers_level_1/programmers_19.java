package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * 프로그래머스 LEVEL_1 같은 숫자는 싫어
 */
public class programmers_19 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		//중복된 숫자를 제거하고 넣은 리스트를 선언한다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		//중복된 수를 판별할 변수를 선언한다.
		int temp = 10;
		//주어진 배열의 중복된수를판별하기 위하여 for문을 사용한다.
		for(int num : arr) {
			//만약 판별할 변수와 배열의수와 같지않으면 리스트에 넣어준다.
			// ex) 10 != 1
			//변수에 이전값을 대입을 해줬기때문에 다음수와 같으면 리스트에 넣지않고
			//temp변수에 값을 대입시켜서 다음 값과 판별한다.
			if(temp != num) {
				list.add(num);
			} 
			//배열의 수를 판별할 변수에 대입한다.
			//ex) temp = 1;
			temp = num;
			
		}
		
		//중복을 제거한 수의 사이즈만큼 배열을 선언한다.
		int[] answer = new int[list.size()];
		
		//for문을 이용하여 리스트에서 배열로 값을 넣어준다.
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
