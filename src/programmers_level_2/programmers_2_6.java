package programmers_level_2;

import java.util.HashMap;
	/*
	 * 프로그래머스 LEVEL_2 전화번호 목록 
	 */
public class programmers_2_6 {

	public static void main(String[] args) {
		boolean answer = true; 
		String[] phoneBook = {"12","123","1235","567","88"};
		// 1. HashMap 만들기
		HashMap<String, Integer> map = new HashMap<>(); 
		// 2. 모든 전화번호 Hashing 하기 (Hash Map에 추가하기) 
		for(int i = 0; i < phoneBook.length; i++) 
			map.put(phoneBook[i], i); 
		//map에 들어가는 값 확인.
		map.forEach((k,v)-> System.out.println("key: "+k+"   value: " +v));
		// 3. 다시 돌며 각 전화번호의 일부가 HashMap에 있는지 확인하기 (접두어가 존재하는지 확인하기) 
		for (int i = 0; i < phoneBook.length; i++) {
			//hashMap에서 순서대로 접두어가 있는지 확인.
			for (int j = 1; j < phoneBook[i].length(); j++) {
				//containsKey(key)
				//맵에서 인자로 보낸 키가 있으면 true 없으면 false를 반환한다.
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
