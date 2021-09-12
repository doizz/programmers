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

	        for (int i = 0; i < table.length; i++) {
	            String jobLang[] = table[i].split(" ");
	            String job = "";
	            int sum = 0;

	            for (int j = 0; j < jobLang.length; j++) {
	                int score = jobLang.length - j;

	                //0번째 직업군 이름
	                if (j == 0) {
	                    job = jobLang[j];
	                    continue;
	                }

	                //직업군 언어와 개발자언어가 같은 경우 점수 계산
	                for (int k = 0; k < languages.length; k++) {
	                    if (languages[k].equals(jobLang[j])) {
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
