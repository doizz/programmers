package programmers_level_2;

import java.util.HashMap;
	/*
	 * ���α׷��ӽ� LEVEL_2 ��ȭ��ȣ ��� 
	 */
public class programmers_2_6 {

	public static void main(String[] args) {
		boolean answer = true; 
		String[] phoneBook = {"12","123","1235","567","88"};
		// 1. HashMap �����
		HashMap<String, Integer> map = new HashMap<>(); 
		// 2. ��� ��ȭ��ȣ Hashing �ϱ� (Hash Map�� �߰��ϱ�) 
		for(int i = 0; i < phoneBook.length; i++) 
			map.put(phoneBook[i], i); 
		//map�� ���� �� Ȯ��.
		map.forEach((k,v)-> System.out.println("key: "+k+"   value: " +v));
		// 3. �ٽ� ���� �� ��ȭ��ȣ�� �Ϻΰ� HashMap�� �ִ��� Ȯ���ϱ� (���ξ �����ϴ��� Ȯ���ϱ�) 
		for (int i = 0; i < phoneBook.length; i++) {
			//hashMap���� ������� ���ξ �ִ��� Ȯ��.
			for (int j = 1; j < phoneBook[i].length(); j++) {
				//containsKey(key)
				//�ʿ��� ���ڷ� ���� Ű�� ������ true ������ false�� ��ȯ�Ѵ�.
				System.out.println(phoneBook[i].substring(0, j));
				if (map.containsKey(phoneBook[i].substring(0, j))) {
					answer = false;
					System.out.println(answer);
				}
			}
		}
		System.out.println(answer);

	}

}
