package programmers_level_2;

import java.util.PriorityQueue;
	/*
	 * ���α׷��ӽ� LEVEL_2 �� �ʰ�
	 */
public class programmers_2_4 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int aScoville : scoville) {
        	//������� ���� �����͸� �ִ´�.
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                System.out.println(-1); 
            }
            //ù��° ���� a�� �����Ѵ�.
            int a = heap.poll();
            //�ι�° ���� b�� �����Ѵ�.
            int b = heap.poll();

            //�־��� �������� ���ں� ������ �����.
            int result = a + (b * 2);
            
            //���ں������� �ٽ� heap�� �����Ѵ�.
            heap.offer(result);
            //ī���͸� ������Ų��.
            answer ++;
        }
        
        //���ں� ������ ��ȯ�Ѵ�.
        System.out.println(answer);
	}

}
