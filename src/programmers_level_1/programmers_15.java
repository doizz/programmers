package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * 프로그래머스 LEVEL_1 두개 뽑아서 더하기
 */
public class programmers_15 {

	public static void main(String[] args) {
		int[] number = {5,0,2,7};
		int sum =0;
		//두 수의 합계를 담을 List 선언
		ArrayList<Integer> set = new ArrayList<Integer>();
		//합계를 구할 첫번째 수를 number의 길이만큼 1씩 증가시킨다.
		for(int i=0 ; i<number.length ; i++) {
			//첫번쨰수와 더할 두번째수를 number의 길이만큼 1씩 증가시킨다.
			for (int j=i+1 ; j<number.length ; j++) {
				//첫번째 수와 두번째 수를 더하여 변수에 담는다.
				sum = number[i]+number[j];
				//indexOf()를 이용하여 합계를 리스트에 담아준다.
				if(set.indexOf(sum)<0)
					set.add(sum);
			} 
		}
		//배열의 사이즈를 리스트의 사이즈만큼 생성한다.
		int[] answer = new int[set.size()];
		//배열에 리스트의 값을 넣어준다.
		for(int i=0 ; i< set.size() ; i++) {
			answer[i] = set.get(i);
		}
		//배열을 정렬시켜준다.
		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
	}

}
