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
	        //��ü ǥ�� ����ִ� ���̺��� �Ѱ��� for���� ���� �ݺ��Ѵ�.
	        for (int i = 0; i < table.length; i++) {
	        	//table�� i��°�� ������ ������ �迭�� �ִ´�.
	            String jobLang[] = table[i].split(" ");
	            //�� �������� job���� ���� ������ �����Ѵ�.
	            String job = "";
	            int sum = 0;
	            
	            //�Ѱ��� �������� ���Ͽ� ������ ���� �������� ���Ͽ� �ݺ����� ����Ѵ�.
	            for (int j = 0; j < jobLang.length; j++) {
	            	//������ �ش��ϴ� ������ ������ ������ ��´�.
	                int score = jobLang.length - j;

	                //0��° ������ �̸�
	                //�迭�� ù������ ������ �̸��̹Ƿ� job������ �ְ� continue �Լ��� �������´�.
	                if (j == 0) {
	                    job = jobLang[j];
	                    continue;
	                }

	                //������ ���� �����ھ� ���� ��� ���� ���
	                for (int k = 0; k < languages.length; k++) {
	                //ù��° �迭�� ���Ͽ� �����ھ� ������ �Ǻ��Ѵ�.
	                    if (languages[k].equals(jobLang[j])) {
	                    	//���� ��� �ش��ϴ� ������ ���Ѵ�.
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
