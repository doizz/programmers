package programmers;

import java.util.*;

public class programmers_3 {
	/*
	 * 프로그래머스 완주하지못한 선수 찾기
	 */
	public static void main(String[] args) {
		//마라톤에 참가한 인원
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		//마라톤에 완주한 인원
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		int i ;
		//마라톤에 참가한 인월 과 완주한 인원의 배열을 정렬시킨다.
		Arrays.sort(participant);
		Arrays.sort(completion);
		//완주한 인원의 배열만큼 포문을 돌린다.
		for( i=0; i<completion.length ; i++) {
			//만약 완주한 인원과 참가한 인원의 이름이 다를경우 그 값을 리턴시킨다.
			if(!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
			}
		}
		//완주못한 인원이 배열의 끝에있을경우 그 값을 리턴시킨다.
		System.out.println(participant[i]);
	}

}
