package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers_20 {

	public static void main(String[] args) {
		
		int[] arr = {2,36,1,3};
		int divisor = 5;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num : arr) {
			if(num % divisor ==0) {
				list.add(num);
			}
		}
		if(list.size() ==0) {
			int[] answer = {-1};
			System.out.println(Arrays.toString(answer));
		} else {
			int[] answer = new int[list.size()];

			for(int i=0; i<answer.length ; i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
			System.out.println(Arrays.toString(answer));
		}
		
	}

}
