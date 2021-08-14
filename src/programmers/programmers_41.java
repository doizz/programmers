package programmers;
	/*
	 * 프로그래머스 LEVEL_1 (핸드폰 번호 가리기) 
	 */
public class programmers_41 {

	public static void main(String[] args) {
		String num = "02154231851";
		//입력받은 수를 한글자씩 잘라 배열에 담는다.
		String[] arr = num.split("");
		
		String answer = "";
		//배열의 길이만큼 반복분을 실행한다.
		for(int i=0 ; i<arr.length ; i++) {
			//i가 배열의길이-4보다 작다면 * 표시를한다.
			if(i < arr.length-4) {
				answer += "*";
			} else {
			//i가 배열의길이-4보다 크다면 숫자를 표시를한다.
				answer += arr[i];
			}
		}
		//마스킹처리한 값을 리턴한다.
		System.out.println(answer);
	}

}
