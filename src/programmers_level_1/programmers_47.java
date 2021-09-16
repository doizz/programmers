package programmers_level_1;

	/*
	 * 프로그래머스 LEVEL_1 1주차
	 */
public class programmers_47 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		long answer = 0;
		//주어진 금액을 long으로 형변환을 한다.
		long money2 = Long.valueOf(money);
		//가지고잇는 금액에서 탈때마다 증가되는 금액을 빼준다.
        for(int index = 1; index <= count; index++){
            money2 -= price * index;
        }
        //금액이 0보다 작으면 부족한 금액 , 부족하지않으면 0을 리턴시킨다.
        answer = money2 < 0 ? money2 * -1 : 0;
        
        System.out.println(answer);
	}

}
