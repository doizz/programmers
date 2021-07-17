package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers_11 {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] person1 = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] arr = new int[3];
		//정답과 일치하는 수포자의 답이 있는지 체크한다.
		for (int i = 0; i < answers.length; i++) {
			if (person1[i % person1.length] == answers[i])
				arr[0]++;
			if (person2[i % person2.length] == answers[i])
				arr[1]++;
			if (person3[i % person3.length] == answers[i])
				arr[2]++;
		}
		//Math.max함수를 이용하여 많이 많은 수포차를 구한다.
		int maxValue = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		ArrayList<Integer> list = new ArrayList<>();

		//많이 많은 숫자를 리스트에 넣는다.
		if (maxValue == arr[0])
			list.add(1);
		if (maxValue == arr[1])
			list.add(2);
		if (maxValue == arr[2])
			list.add(3);

		int[] answer = new int[list.size()];
		//정렬하여 많이 맞은 순으로 정렬 후 리턴한다.
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
