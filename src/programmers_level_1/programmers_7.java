package programmers_level_1;

public class programmers_7 {
	/*
	 *  프로그래머스 LEVEL_1 신규 아이디 추천
	 */
	public static void main(String[] args) {

		/*
		 *  1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
			2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
			3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
			5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
			     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
			7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		 */
		String new_id = "..!@BaT#*..y.abcdefghijklm";
		
		new_id = new_id.toLowerCase();
		System.out.println("1단계 - 대문자를 소문자로 치환 :"+new_id);
		
		new_id = new_id.replaceAll("[^a-z\\d\\-_.]*", "");
		System.out.println("2단계 - 소문자,문자,숫자,뺴기,밑중,마침표 제거 : "+new_id);
		
		new_id = new_id.replaceAll("[.]{2,}", ".");
		System.out.println("3단계 - 마침표가 2번이상일때 하나의 마침표로 치환 : "+new_id);
		
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		System.out.println("4단계 - 마침표가 처음이나 끝에 위치하면 제거 : "+new_id);
		
		if(new_id.equals("")) {
			new_id = "a";
		}
		System.out.println("5단계 - 빈 문자열이라면 a를 대입 : "+new_id);
		
		if(new_id.length()>=16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		System.out.println("6단계 - 길이가 16자 이상이면 15자의 문자로 자르기 + 4단계 : "+ new_id);
		if(new_id.length() <=2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
		
		System.out.println("7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3일될때까지 반복 : "+new_id);
	}

}
