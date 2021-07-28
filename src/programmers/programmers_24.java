package programmers;
	/*
	 * 프로그래머스 LEVEL_1 소수찾기
	 */
public class programmers_24 {
	public static void main(String[] args) {
		
		int n = 5;
		int cnt = 0;
		int[] number = new int[n+1];
		
		for(int i=2 ; i<=n ; i++) {
			number[i] = i;
		}
		
		for(int i=2; i<=n ; i++) {
			if(number[i]==0) continue;
			
			for(int j=2*i ; j<=n ; j+=i) {
				number[j] =0;
			}
		}
		
		for(int i=0 ; i<number.length ; i++) {
			if(number[i]!=0)
				cnt++;
		}
		 System.out.println(cnt);
	}
}
