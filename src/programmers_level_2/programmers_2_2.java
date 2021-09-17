package programmers_level_2;
	/*
	 * 프로그래머스 LEVEL_2 멀쩡한 사각형
	 */
public class programmers_2_2 {

	public static void main(String[] args) {
		
		/* ====풀이====
		 * 일차 함수 그래프라고 생각하면 쉽다. 두 꼭지점을 잇게 되면
			하나의 일차 함수 그래프가 그려지게 되는데 바로
			기울기가 12/8인 y = 12/8x 그래프가 그려지게 된다.
			여기서 x에 0부터 11까지 대입을 하게 되면
			0일때는 12/8*0 즉, 0 이라서 0개
			1일때는 12/8*1 즉, 1.xxx 라서 1개
			2일때는 12/8*2 즉, 3 이라서 3개
			마지막 7일때는 12/8*7 즉, 10.xxx 라서 10개
			이렇게 모두 x가 0부터 7일때까지 더해서 대칭 이니깐 곱하기 2를 해주면
			멀쩡한 사각형을 구할 수 있다.
			즉, 기울기가 W/H인 y = W/Hx 에 0부터 W-1 까지 대입해 더해서 곱하기 2를 해주면 된다.
		 */
		long answer = 0;
        int w = 8;
        int h = 12;
		
        //w,h 수가 1억이 넘어갈수 있으니 long타입으로 변환한다.
        for(int i=0; i<w; i++) {
            answer += (long) h*i/(long)w ;
        }
        
        System.out.println(answer * 2);
	}

}
