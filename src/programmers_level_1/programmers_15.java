package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * ���α׷��ӽ� LEVEL_1 �ΰ� �̾Ƽ� ���ϱ�
 */
public class programmers_15 {

	public static void main(String[] args) {
		int[] number = {5,0,2,7};
		int sum =0;
		//�� ���� �հ踦 ���� List ����
		ArrayList<Integer> set = new ArrayList<Integer>();
		//�հ踦 ���� ù��° ���� number�� ���̸�ŭ 1�� ������Ų��.
		for(int i=0 ; i<number.length ; i++) {
			//ù�������� ���� �ι�°���� number�� ���̸�ŭ 1�� ������Ų��.
			for (int j=i+1 ; j<number.length ; j++) {
				//ù��° ���� �ι�° ���� ���Ͽ� ������ ��´�.
				sum = number[i]+number[j];
				//indexOf()�� �̿��Ͽ� �հ踦 ����Ʈ�� ����ش�.
				if(set.indexOf(sum)<0)
					set.add(sum);
			} 
		}
		//�迭�� ����� ����Ʈ�� �����ŭ �����Ѵ�.
		int[] answer = new int[set.size()];
		//�迭�� ����Ʈ�� ���� �־��ش�.
		for(int i=0 ; i< set.size() ; i++) {
			answer[i] = set.get(i);
		}
		//�迭�� ���Ľ����ش�.
		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
	}

}
