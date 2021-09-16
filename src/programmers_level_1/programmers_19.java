package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * ���α׷��ӽ� LEVEL_1 ���� ���ڴ� �Ⱦ�
 */
public class programmers_19 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		//�ߺ��� ���ڸ� �����ϰ� ���� ����Ʈ�� �����Ѵ�.
		ArrayList<Integer> list = new ArrayList<Integer>();
		//�ߺ��� ���� �Ǻ��� ������ �����Ѵ�.
		int temp = 10;
		//�־��� �迭�� �ߺ��ȼ����Ǻ��ϱ� ���Ͽ� for���� ����Ѵ�.
		for(int num : arr) {
			//���� �Ǻ��� ������ �迭�Ǽ��� ���������� ����Ʈ�� �־��ش�.
			// ex) 10 != 1
			//������ �������� ������ ����⶧���� �������� ������ ����Ʈ�� �����ʰ�
			//temp������ ���� ���Խ��Ѽ� ���� ���� �Ǻ��Ѵ�.
			if(temp != num) {
				list.add(num);
			} 
			//�迭�� ���� �Ǻ��� ������ �����Ѵ�.
			//ex) temp = 1;
			temp = num;
			
		}
		
		//�ߺ��� ������ ���� �����ŭ �迭�� �����Ѵ�.
		int[] answer = new int[list.size()];
		
		//for���� �̿��Ͽ� ����Ʈ���� �迭�� ���� �־��ش�.
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
