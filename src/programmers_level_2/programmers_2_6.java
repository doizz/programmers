package programmers_level_2;

import java.util.HashMap;
	/*
	 * ���α׷��ӽ� LEVEL_2 ��ȭ��ȣ ��� 
	 */
public class programmers_2_6 {

	public static void main(String[] args) {
		boolean answer = true; 
		String[] phoneBook = {"123","456","789"};
		// 1. HashMap �����
		HashMap<String, Integer> map = new HashMap<>(); 
		// 2. ��� ��ȭ��ȣ Hashing �ϱ� (Hash Map�� �߰��ϱ�) 
		for(int i = 0; i < phoneBook.length; i++) 
			map.put(phoneBook[i], i); 
		// 3. �ٽ� ���� �� ��ȭ��ȣ�� �Ϻΰ� HashMap�� �ִ��� Ȯ���ϱ� (���ξ �����ϴ��� Ȯ���ϱ�) 
		for (int i = 0; i < phoneBook.length; i++) {
			for (int j = 1; j < phoneBook[i].length(); j++) {
				if (map.containsKey(phoneBook[i].substring(0, j))) {
					answer = false;
					System.out.println(answer);
				}
			}
		}
		System.out.println(answer);

	}

}
