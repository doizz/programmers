package programmers;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 ���� ������ �����ϱ�
	 */
public class programmers_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,6,4,1,3};
		//�迭�� ���̰� 1�ϰ�� -1�� �����Ѵ�.
		 if(arr.length == 1) 
			 System.out.println(-1);
	        
	        int minidx = 0;        
	        //�迭�� ���̸�ŭ for���� ������.
	        for(int i=0; i<arr.length; i++) {
	        	//�迭�� �������� ���Ͽ� ������ �ش��ϴ� �ε����� ������ �����Ѵ�.
	            if(arr[minidx] > arr[i]) {
	                    minidx = i;
	            }
	        }
	        
	        //�迭�� ������������ �����ؾ��ϴ� ������ �迭���̿��� -1���Ͽ� �����Ѵ�.
	        int[] answer = new int[arr.length-1];
	        int cnt = 0;
	        //�迭�� ���̸�ŭ for���� ������.
	        for(int i=0; i<arr.length; i++) {
	        	//���� for������ ���ߴ� ���� �������� �ִ� �迭�� �ε����� continue�Ѵ�.
	            if(i == minidx) continue;
	            //�迭�� ������������ ������ ������ ���� �迭�� �����Ѵ�.
	            answer[cnt++] = arr[i];
	        }
	        //������������������ �迭�� �����Ѵ�.
	        System.out.println(Arrays.toString(answer));
	}

}
