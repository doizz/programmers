package programmers_level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
	/*
	 * 프로그래머스 LEVEL_2 (기능개발)
	 */
public class programmers_2_3 {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		//큐를 생성한다.
		 Queue<Integer> queue = new LinkedList<>();
		 //각 점수에 대하여 남은 일수를 계산한다.
		 // ex 100- 95 / 1 = 5
	        for (int i = 0; i < progresses.length; i++)
	        	//남은일수를 계산하여 큐에 넣는다.
	            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
	        
	        System.out.println(queue);
	        List<Integer> ans = new ArrayList<>();
	        //큐가 비어있지않을때까지 while문을 돌린다.
	        while (!queue.isEmpty()) {
	        	//queue.poll() -> 큐의 첫번째요소를 가져온후 제거한다.
	            int day = queue.poll();
	            int cnt = 1;
	            //queue.peek() 첫번째요소를 가져온다.
	            // poll() , peek() 차이점 -> 요소를 가져온후 제거하는지 안하는지에 따라 다르다.
	            while (!queue.isEmpty() && day >= queue.peek()) {
	            	//큐의 첫번째 요소를 day넣고 지운다음, 첫번째요소와 2번째 요소를 비교한다.
	                cnt++;
	                //첫번째 요소가 클경우 변수 cnt를 증가시킨다.
	                queue.poll();
	                //그다음 요소를 제거한다
	            }
	            //배포되는 기능을 list에 담는다.
	            ans.add(cnt);
	        }
	        int[] answer = new int[ans.size()];
	        for(int i=0 ; i<ans.size() ; i++) {
	        	answer[i] = ans.get(i);
	        }
	        System.out.println(Arrays.toString(answer));
	        //배포되는 기능 list를 반환한다.
//	       System.out.println(ans.size());
//	        System.out.println(ans);
//	        System.out.println(ans.stream().mapToInt(Integer::intValue).toArray()); 
	    }
	}

