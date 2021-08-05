package programmers;

public class programmers_32 {

	public static void main(String[] args) {
		String s ="z";
		int n=1;
		String result ="";
		//s의 길이만큼 for문을 돌린다.
		for(int i=0 ; i<s.length() ; i++) {
		//s의 문자열에서 한글자씩 ch변수에 담는다.	
		char ch = s.charAt(i);
		
		//변수에 담긴 알파벳이 a보다 크고 z보다 작은지 판별한다.
		if(ch >= 'a' && ch<='z') {
			//주어진 알파벳에서 다음 n번째의 알파벳을 구한다.
			ch = (char) (ch + n);
			//z보다 커질경우 -26을 해서 알파벳을 구한다.
			if(ch > 'z') {
				ch -= 26;
			}
		//대문자 형식도 소문자와 똑같다.
		} else if(ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + n);
				if( ch > 'Z') {
					ch -= 26;
				}
			}
		//구해진 알파벳을 변수에 담는다.
		result += ch;
		}
		
		System.out.println(result);
		}
		
	}

