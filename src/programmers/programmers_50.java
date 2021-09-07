package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
	
	/*
	 * ���α׷��ӽ� LEVEL_1 ������
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
                
                //���� �������� Ŭ���� ���ѻ��
                if(stage == player) {
                    noClearPlayer++;
                }
                //���� �������� ������
                if(stage<=player) {
                    currentStagePlayer++;
                }
            }
            
            //���������� ������ ������ ���� ��� ������ = 0
            //������ = ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� �� (�����ڼ�)
            double failureRate = 0;
            if(noClearPlayer!=0 && currentStagePlayer!=0) {
                failureRate = (double)noClearPlayer / (double)currentStagePlayer;
            }
            
            map.put(stage, failureRate);
            
        }
        
        //value�� �����Ͽ� answer�迭�� �ֱ�
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
