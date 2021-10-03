package programmers_level_2;

	/*
	 * 프로그래머스 LEVEL_2 (문자열 압축하기)
	 */
public class programmers_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ababcdcdababcdcd";
		
		//길이가 1일경우 1을 리턴한다.
		if(s.length() == 1) 
			System.out.println(1);
        
		
        int answer = 1001;
        //문자열은 압축할수있는경우는 변수 s의 2/1을 넘을수 없으니 %2까지만 반복문을 돌린다.
        for (int i = 1; i <= s.length() / 2; i++) {
            String now, next = "", result = "";
            int hit = 1;
            //i의 길이만큼 문자열을 잘라서 비교한다.
            for (int j = 0; j <= s.length() / i; j++) {
                int start = j * i;
                System.out.println("start::::::::"+start);
                int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
                //현재 문자열을 now변수에 저장한다.
                now = next;
                //다음문자열을 짤라서 비교한다.
                next = s.substring(start, end);
                
                System.out.println("next:::::::"+next);
                //같을경우 hit 변수에 더하기를 해준다.
                if(now.equals(next)) {
                    hit++;
                } else {
                	//다를경우 result 변수에 압축한 문자열을 붙인다.
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
