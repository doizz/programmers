package programmers_level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
	/*
	 * ���α׷��ӽ� LEVEL_2 (��ɰ���)
	 */
public class programmers_2_3 {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		//ť�� �����Ѵ�.
		 Queue<Integer> queue = new LinkedList<>();
		 //�� ������ ���Ͽ� ���� �ϼ��� ����Ѵ�.
		 // ex 100- 95 / 1 = 5
	        for (int i = 0; i < progresses.length; i++)
	        	//�����ϼ��� ����Ͽ� ť�� �ִ´�.
	            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
	        
	        System.out.println(queue);
	        List<Integer> ans = new ArrayList<>();
	        //ť�� ����������������� while���� ������.
	        while (!queue.isEmpty()) {
	        	//queue.poll() -> ť�� ù��°��Ҹ� �������� �����Ѵ�.
	            int day = queue.poll();
	            int cnt = 1;
	            //queue.peek() ù��°��Ҹ� �����´�.
	            // poll() , peek() ������ -> ��Ҹ� �������� �����ϴ��� ���ϴ����� ���� �ٸ���.
	            while (!queue.isEmpty() && day >= queue.peek()) {
	            	//ť�� ù��° ��Ҹ� day�ְ� �������, ù��°��ҿ� 2��° ��Ҹ� ���Ѵ�.
	                cnt++;
	                //ù��° ��Ұ� Ŭ��� ���� cnt�� ������Ų��.
	                queue.poll();
	                //�״��� ��Ҹ� �����Ѵ�
	            }
	            //�����Ǵ� ����� list�� ��´�.
	            ans.add(cnt);
	        }
	        int[] answer = new int[ans.size()];
	        for(int i=0 ; i<ans.size() ; i++) {
	        	answer[i] = ans.get(i);
	        }
	        System.out.println(Arrays.toString(answer));
	        //�����Ǵ� ��� list�� ��ȯ�Ѵ�.
//	       System.out.println(ans.size());
//	        System.out.println(ans);
//	        System.out.println(ans.stream().mapToInt(Integer::intValue).toArray()); 
	    }
	}

