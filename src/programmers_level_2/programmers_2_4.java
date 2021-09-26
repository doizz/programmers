package programmers_level_2;

import java.util.PriorityQueue;
	/*
	 * 프로그래머스 LEVEL_2 더 맵게
	 */
public class programmers_2_4 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int aScoville : scoville) {
        	//순서대로 힙에 데이터를 넣는다.
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                System.out.println(-1); 
            }
            //첫번째 값을 a에 대입한다.
            int a = heap.poll();
            //두번째 값을 b에 대입한다.
            int b = heap.poll();

            //주어진 공식으로 스코빌 지수를 만든다.
            int result = a + (b * 2);
            
            //스코빌지수를 다시 heap에 저장한다.
            heap.offer(result);
            //카운터를 증가시킨다.
            answer ++;
        }
        
        //스코빌 지수를 반환한다.
        System.out.println(answer);
	}

}
