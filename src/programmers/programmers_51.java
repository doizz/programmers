package programmers;
	/*
	 * 프로그래머스 LEVEL_1 2주차_상호평가
	 */
public class programmers_51 {

	public static void main(String[] args) {
		 String answer = "";
		 int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
	        for (int i = 0; i < scores.length; i++) {
	            int ownScore = scores[i][i];
	            boolean sameScore = true;
	            int max = scores[0][i];
	            int min = scores[0][i];
	            int sum = 0;
	            int divide = 0;
	            double avg;

	            for (int j = 0; j < scores.length; j++) {
	                //자기자신의 값과 똑같은 값 찾기
	                if (i != j && ownScore == scores[j][i]) {
	                    sameScore = false;
	                }

	                //열 비교
	                if (max < scores[j][i]) {
	                    max = scores[j][i];
	                }
	                if (min > scores[j][i]) {
	                    min = scores[j][i];
	                }

	                sum += scores[j][i];
	                divide++;
	            }

	            //유일한 최고, 최저일 경우 제외
	            if (sameScore && (max == ownScore || min == ownScore)) {
	                sum -= ownScore;
	                divide--;
	            }

	            avg = (double)sum / (double)divide;
	            answer += getRank(avg);
	        }

	        System.out.println(answer); 
	    }
	    
	    public static String getRank(double score) {
	        if (score >= 90) {
	            return "A";
	        }
	        if (score >= 80) {
	            return "B";
	        }
	        if (score >= 70) {
	            return "C";
	        }
	        if (score >= 50) {
	            return "D";
	        }

	        return "F";
	    }
	}
