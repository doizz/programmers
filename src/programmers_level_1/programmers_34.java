package programmers_level_1;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 자릿수 뒤집어 배열만들기
	 */
public class programmers_34 {

	public static void main(String[] args) {
		long n = 12345;
		//int형을 String으로 변환시켜준다.
		String a = ""+n;
		int cnt = 0;
		
		//주어진 수 만큼 배열을 생성한다.
		int[] answer = new int[a.length()];
		
		//주어진 수 n의 0보다클때까지 반복시켜준다.
		 while(n>0){
			 //배열의 첫번째부터 주어진수 나누기 10을하여 값을 만든다.
            answer[cnt] = (int) (n%10);
            //주어진수 나누기 10을하여 다음수를 나눌 값을 세팅한다.
            n /= 10;
            //배열의 순서를 맞출 변수를 증가시킨다.
            cnt++;
        }
		System.out.println(Arrays.toString(answer));
	}

}
