package programmers_level_1;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 ����� ����
	 */
public class programmers_45 {

	public static void main(String[] args) {
		int[][] arr = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		//������ ������ �迭�� ũ�⸦ �����Ѵ�.
		int[][] answer = new int[arr.length][arr[0].length];
		
		//���� for���� ����Ͽ� �迭�� ���� �־��ش�.
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				//�־��� �迭�� �࿭�� ���� ���� ���� ������ ������ �־��ش�.
				answer[i][j] = arr[i][j]+arr2[i][j];
			}
		}
		//���� �����Ѵ�.
		System.out.println(Arrays.deepToString(answer));
	}

}
