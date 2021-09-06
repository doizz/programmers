package programmers;
	/*
	 * 프로그래머스 LEVEL_1 키패드누르기
	 */
public class programmers_48 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String ans = solution(numbers, hand);
		System.out.println(ans);
	}
	
	private static String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left=10, right=12;
		int L_dis, R_dis;
		for(int n : numbers) {
			L_dis = 0; R_dis = 0;
			if(n == 1 || n == 4 || n == 7) {
				sb.append("L");
				left = n;
			
			}else if(n == 3 || n == 6 || n == 9) {
				sb.append("R");
				right = n;
			
			}else {
				//0인경우 11로 바꿔준다.
				if(n==0) n += 11;
				
				//가까운 거리를 구한다.
				L_dis = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
				R_dis = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
				
				//만약 거리가 같을경우 왼손잡이인지, 오른손잡이인지 판별한다.
				if(L_dis == R_dis) {
					//오른손잡이 일경우 
					if(hand.equals("right")) {
						sb.append("R");
						right = n;
					}else {
					//왼손잡이 일경우
						sb.append("L");
						left = n;
					}
				}else if(L_dis > R_dis) {
					sb.append("R");
					right = n;
				}else {
					sb.append("L");
					left = n;
				}
			}
		}
		
		return sb.toString();
	}

}
