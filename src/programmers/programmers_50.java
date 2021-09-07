package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
	
	/*
	 * 프로그래머스 LEVEL_1 실패율
	 */
public class programmers_50 {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();
        //<stage,failureRate>
        
        for(int i=1; i<=N; i++) {
            int stage = i;
            int noClearPlayer = 0;
            int currentStagePlayer = 0;
            
            for(int j=0; j < stages.length; j++) {
                int player = stages[j];
                
                //현재 스테이지 클리어 못한사람
                if(stage == player) {
                    noClearPlayer++;
                }
                //현재 스테이지 도전자
                if(stage<=player) {
                    currentStagePlayer++;
                }
            }
            
            //스테이지에 도달한 유저가 없는 경우 실패율 = 0
            //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 (도전자수)
            double failureRate = 0;
            if(noClearPlayer!=0 && currentStagePlayer!=0) {
                failureRate = (double)noClearPlayer / (double)currentStagePlayer;
            }
            
            map.put(stage, failureRate);
            
        }
        
        //value순 정렬하여 answer배열에 넣기
        for(int i=0; i<N; i++) {
            double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }
        
        System.out.println(Arrays.toString(answer));
        
 


	}

}
