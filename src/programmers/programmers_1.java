package programmers;

import java.util.Arrays;

public class programmers_1 {

	/*
	 * ���α׷��ӽ� LEVEL_1 K��°�� ���ϱ�
	 */
	
	public static void main(String[] args) {

		int[] answer = {1,5,2,6,3,7,4};
        
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

		//���� ���� ������ �迭�� �����Ѵ�.
        //���� commands �迭�� length��ŭ�� ���̸� �ʱ�ȭ�����ش�.
		int[] result = new int[commands.length];

        //commands�� �迭�� ���� answer�迭�� ���� �����Ѵ�.
        for(int i=0 ; i < commands.length ; i++) {
        	//Arrays.copyOfRange(�迭�̸�, ���۰�, ����)�� ����Ͽ� ���� �Ľ��Ѵ�.
        	int[] answer2 = Arrays.copyOfRange(answer, commands[i][0]-1, commands[i][1]);
        	//Arrays.copyOfRange�� �Ľ��� ���� �����Ѵ�.
        	Arrays.sort(answer2);
        	//������ ������ �ʿ��� ���� �Ľ��Ͽ� ������ �迭�� �߰��Ѵ�.
            result[i] = answer2[commands[i][2]-1];
          
        }
        
        System.out.println(Arrays.toString(result));
    }
	
	
	}

