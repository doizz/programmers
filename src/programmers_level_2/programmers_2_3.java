package programmers_level_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class programmers_2_3 {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1,30,5};
		
		 Queue<Integer> queue = new LinkedList<>();
	        for (int i = 0; i < progresses.length; i++)
	            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));

	        List<Integer> ans = new ArrayList<>();
	        while (!queue.isEmpty()) {
	            int day = queue.poll();
	            int cnt = 1;

	            while (!queue.isEmpty() && day >= queue.peek()) {
	                cnt++;
	                queue.poll();
	            }
	            ans.add(cnt);
	        }
	        System.out.println(ans.stream().mapToInt(Integer::intValue).toArray()); 
	    }
	}

