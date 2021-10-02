package programmers_level_2;

	/*
	 * 프로그래머스 LEVEL_2 (문자열 압축하기)
	 */
public class programmers_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ababcdcdababcdcd";
		if(s.length() == 1) 
			System.out.println(1);
        
        int answer = 1001;
        for (int i = 1; i <= s.length() / 2; i++) {
            String now, next = "", result = "";
            int hit = 1;
            for (int j = 0; j <= s.length() / i; j++) {
                int start = j * i;
                System.out.println("start::::::::"+start);
                int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
                now = next;
                next = s.substring(start, end);
                
                System.out.println("next:::::::"+next);
                if(now.equals(next)) {
                    hit++;
                } else {
                    result += (processHit(hit) + now);
                    hit = 1;
                }
            }
            result += (processHit(hit) + next);
            answer = Math.min(answer, result.length());
        }
        System.out.println(answer);
	}
	private static String processHit(int hit) {
	    return hit > 1 ? String.valueOf(hit) : "";
	}
}
