package programmers;

import java.util.Arrays;

public class programmers_18 {
	/*
	 * ���α׷��ӽ� LEVEL_1 1�� �������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int[] arr1= {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		//�迭�� ���̸�ŭ ��ȯ�� ������ ũ�⸦ �����Ѵ�.
		String[] answer= new String[n];
        for(int i = 0; i < n; i++) {
        	//toBinaryString() �޼ҵ带����Ͽ� ��Ʈ������ �����Ѵ�.
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%"+n+"s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        	}
        
		System.out.println(Arrays.toString(answer));
	}

}
