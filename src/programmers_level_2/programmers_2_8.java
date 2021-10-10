package programmers_level_2;
	/*
	 * 프로그래머스 LEVEL_2 큰수 만들기 (탐욕법) 
	 */
public class programmers_2_8 {

	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        System.out.println(sb.toString());
	}

}
