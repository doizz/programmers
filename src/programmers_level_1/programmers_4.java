package programmers_level_1;

import java.util.*;
public class programmers_4 {

		/*
		 * ���α׷��ӽ� LEVEL_1 ���ϸ� ���� ���ϱ�
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ϸ� ������ ���� ���ڸ� �迭�� �޴´�.
		int[] nums = {3,3,3,2,2,4};
		
		
		//������ ���� �ִ� ���ϸ��� ������ nums�� ���̴�
		int getPok = nums.length/2;
		int kinds = 0;
		//HasSet�� �̿��Ͽ� �ߺ����� ���ϸ��� ������ ���Ѵ�.
		HashSet<Integer> pokSet = new HashSet<Integer>();
		for(int num : nums) {
			pokSet.add(num);
		}
		
		//���ϸ��� ������� �� ����� ���� ������ �ִ´�.
		kinds = pokSet.size();
		
		//������ �����ִ����ϸ��� ������ �������� �� ũ�ų� ������� ���� ������ ���� ���Ͻ�Ų��.
		if(kinds <= getPok) {
			System.out.println(kinds);
		} else {
		//������ ���� �ִ� ���ϸ��� ������ �������� �����ÿ��� ���ϸ��� ������ ���Ͻ�Ų��.
			System.out.println(getPok);
		}
	}

}
