package programmers_level_1;

	/*
	 * 프로그래머스 LEVEL_1 문자열 내 p와 y의 개수
	 */
public class programmers_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPoooyY";
		boolean answer = true;
		int p_cnt = 0;
		int y_cnt = 0;
		//한글자씩 배열에 담을 변수를 선언후 소문자로 변환후 한글자씩 배열에 넣어준다.
		//charAt() 함수를 사용해도된다.
		String[] s_array = s.toLowerCase().split("");
		
		//배열의 크기만큼 for문을 돌린다.
		for (int i=0 ; i<s_array.length ; i++) {
			//배열의 글자가 p일경우 p_cnt 변수를 증가시킨다.
			//카운틉 변수를 하나만 선언후 p에서는 +를 y에서는 마이너스를 시키는것도 하나의방법
			if(s_array[i].equals("p")) {
				p_cnt++;
			} else if (s_array[i].equals("y")) {
				y_cnt++;
			}
		}
		//p와 y의 갯수가 맞는지 판별한다.
		if(p_cnt != y_cnt) {
			//다를경우 거짓을 리턴한다.
			answer = false;
		}
		System.out.println(answer);
	}
}
