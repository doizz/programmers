package programmers;


	/*
	 * ���α׷��ӽ� LEVEL_1 (4���� ������_��õ�ϱ�)
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

	                //0��° ������ �̸�
	                if (j == 0) {
	                    job = jobLang[j];
	                    continue;
	                }

	                //������ ���� �����ھ� ���� ��� ���� ���
	                for (int k = 0; k < languages.length; k++) {
	                    if (languages[k].equals(jobLang[j])) {
	                        sum += preference[k] * score;
	                    }
	                }
	            }

	            //������ ���� ũ�ų� ������
	            if (max <= sum) {
	                //������ ������ ���������� �� (������ ��� ���������� �� ������ ������ ��ŵ)
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
