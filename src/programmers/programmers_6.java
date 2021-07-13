package programmers;

public class programmers_6 {
	/*
	 * 프로그래머스 LEVEL_1 체육복(탐욕법)
	 */
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int lostPlus =0;
		int reservePlus=0;
		//여벌의 체육복을 가지고있는 학생도 도난당했을 경우도 있기때문에 조건에 해당하는 학생을 판별한다.
		for(int i=0 ; i < lost.length ; i++) {
			for(int j=0 ; j < reserve.length ; j++) {
				if(lost[i] == reserve[j]) {
					//해당조건에 해당하는 학생을 수업을 들을수 있으니 변수에 더하기를 해준다.
					lostPlus++;
					//여벌의 체육복을 가지고있는 학생이 도난학생일 경우 빌려줄 체육복이 없으므로 빌려줄수있는 배열(reserve)와 잃어버린 학생의 배열(lost)에서 제외
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		for(int i=0 ; i < lost.length ; i++) {
			for(int j=0 ; j < reserve.length ; j++) {
				//여벌의 체육복을 가지고있는 학생숫자에서 앞,뒤의 숫자의 학생만 여벌의 체육복을 빌려줄수 있다.
				//그래서 reserver배열의서 +1, -1을 하여 빌려줄수 있는 학생인지 판별한다.
				if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
					//해당하는 조건에 맞으면 변수에 더하기를 한다.
					reservePlus++;
					//reserve배열의 다음 학생이 똑같은 학생에서 빌려줄수 없게 값을 -1로 변경한
					reserve[j] = -1;
					break;
				}
			}
		}
		//전체 학생수에서 도난당한 학생의 수를 빼고, 여벌의 옷을 가진학생이 도난당했으면 그 카운트를 더해주고
		//옷을 빌려 수업에 참가할수 있는 학생수를 더해준다.
		n = n - lost.length + lostPlus + reservePlus;
		System.out.println(n);
	}

}
