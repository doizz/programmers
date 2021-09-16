package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 ���ǰ��
	 */
public class programmers_46 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
ArrayList<Integer> arrList = new ArrayList<>();
        
		//�����ڵ��� ��� ������ �迭�� ��´�.
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        //�����ڵ��� ���� ���� ������ ��� ����.
        int a_r = 0;
        int b_r = 0;
        int c_r = 0;
        
        // 1�� ������: 12345 �ݺ� 5
        // 2�� ������: 21232425 �ݺ� 8
        // 3�� ������: 3311224455 �ݺ� 10
        for(int i=0; i < answers.length; i++){
            if(answers[i] == a[i % 5])
                a_r++;
            if(answers[i] == b[i % 8])
                b_r++;
            if(answers[i] == c[i % 10])
                c_r++;
        }
        
        //���� ���Ͽ� max���� �̴´�.
        int max = Math.max(a_r, Math.max(b_r, c_r));
        if(max == a_r){
            arrList.add(1);
        }
        if(max == b_r)
            arrList.add(2);
        if(max == c_r)
            arrList.add(3);
        
        int size = arrList.size();
        int[] answer = new int[size];
            
        //���� ���� �����ڸ� ���Ͻ�Ų��.
        for(int i =0; i<size; i++){
            answer[i] = arrList.get(i);
        }
        System.out.println(Arrays.toString(answer));
	}

}
