package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	/*
	 * 프로그래머스 LEVEL_1 문자열 내 마음대로 정렬하기
	 */
public class programmers_27 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		//순서를 저장할 리스트를 생성한다.
		ArrayList<String> arrayList = new ArrayList<>();
		
		//입력받은 문자열의 길이만큼 for문을 돌린다.
		for(int i = 0 ; i<strings.length ; i++) {
			//리스트에 해당하는 길이의 문자열을 앞에 추가하여 문자열을 리스트에 저장한다.
			//ex ) abcd -> babcd
			arrayList.add(strings[i].charAt(n)+strings[i]);
		}
		//리스트를 정렬시킨다.
		Collections.sort(arrayList);
		
		//리스트의 길이만큼 리턴할 배열을 생성한다.
		String[] answer = new String[arrayList.size()];
		
		//정렬된 문자열을 하나씩 배열에 대입한다.
		for(int i=0 ; i < arrayList.size() ; i++) {
			answer[i] = arrayList.get(i).substring(1);
		}
		//정렬된 배열을 리턴한다.
		System.out.println(Arrays.toString(answer));
	}

}
