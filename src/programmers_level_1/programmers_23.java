package programmers_level_1;

public class programmers_23 {
	/*
	 * 프로그래머스 LEVEL_1 서울에서 김서방 찾기
	 */
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer="";
		//배열의 길이만큼 for문을 돌려준다.
		for(int i=0 ; i<seoul.length ; i++) {
			//배열의 요소중 "Kim"이 있는지 판별한다.
			if(seoul[i].equals("Kim")) {
				//해당하는 단어의 위치의 값을 찾아서 반환한다.
				answer = "김서방은 "+i+"에 있다.";
				break;
			}
		}
		System.out.println(answer);
	}

}
