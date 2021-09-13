package programmers;


	/*
	 * 프로그래머스 LEVEL_1 (4주차 직업군_추천하기)
	 */
public class programmers_52 {

	public static void main(String[] args) {
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
		 int max = 0;
	        String maxJob = "";
	        //전체 표가 들어있는 테이블을 한개씩 for문을 돌려 반복한다.
	        for (int i = 0; i < table.length; i++) {
	        	//table의 i번째를 공백을 나누어 배열에 넣는다.
	            String jobLang[] = table[i].split(" ");
	            //각 직업군의 job명을 담을 변수를 선언한다.
	            String job = "";
	            int sum = 0;
	            
	            //한개의 직업군의 대하여 공백을 나눈 직업군에 대하여 반복문을 사용한다.
	            for (int j = 0; j < jobLang.length; j++) {
	            	//순서에 해당하는 직업군 점수를 변수에 담는다.
	                int score = jobLang.length - j;

	                //0번째 직업군 이름
	                //배열의 첫번쨰는 직업군 이름이므로 job변수에 넣고 continue 함수로 빠져나온다.
	                if (j == 0) {
	                    job = jobLang[j];
	                    continue;
	                }

	                //직업군 언어와 개발자언어가 같은 경우 점수 계산
	                for (int k = 0; k < languages.length; k++) {
	                //첫번째 배열에 대하여 개발자언어가 같은지 판별한다.
	                    if (languages[k].equals(jobLang[j])) {
	                    	//같을 경우 해당하는 점수를 구한다.
	                        sum += preference[k] * score;
	                    }
	                }
	            }

	            //점수가 가장 크거나 같을때
	            if (max <= sum) {
	                //점수가 같으면 사전순으로 비교 (음수일 경우 사전순으로 더 빠르기 때문에 스킵)
	                if (max == sum) {
	                    if (maxJob.compareTo(job) < 0) {
	                        continue;
	                    }
	                }

	                max = sum;
	                maxJob = job;
	            }
	        }

	        System.out.println(maxJob + " : " + max);

//	        return maxJob;
	        
	}

}
