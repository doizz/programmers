package programmers;

import java.util.Arrays;

public class programmers_1 {

	/*
	 * 프로그래머스 LEVEL_1 K번째수 구하기
	 */
	
	public static void main(String[] args) {

		int[] answer = {1,5,2,6,3,7,4};
        
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

		//값을 리턴 시켜줄 배열을 선언한다.
        //받을 commands 배열의 length만큼의 길이를 초기화시켜준다.
		int[] result = new int[commands.length];

        //commands의 배열의 따라서 answer배열의 값을 추출한다.
        for(int i=0 ; i < commands.length ; i++) {
        	//Arrays.copyOfRange(배열이름, 시작값, 끝값)을 사용하여 값을 파싱한다.
        	int[] answer2 = Arrays.copyOfRange(answer, commands[i][0]-1, commands[i][1]);
        	//Arrays.copyOfRange로 파싱한 값을 정렬한다.
        	Arrays.sort(answer2);
        	//정렬한 값에서 필요한 값을 파싱하여 리턴할 배열에 추가한다.
            result[i] = answer2[commands[i][2]-1];
          
        }
        
        System.out.println(Arrays.toString(result));
    }
	
	
	}

