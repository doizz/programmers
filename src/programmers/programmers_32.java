package programmers;

public class programmers_32 {

	public static void main(String[] args) {
		String s ="z";
		int n=1;
		String result ="";
		//s�� ���̸�ŭ for���� ������.
		for(int i=0 ; i<s.length() ; i++) {
		//s�� ���ڿ����� �ѱ��ھ� ch������ ��´�.	
		char ch = s.charAt(i);
		
		//������ ��� ���ĺ��� a���� ũ�� z���� ������ �Ǻ��Ѵ�.
		if(ch >= 'a' && ch<='z') {
			//�־��� ���ĺ����� ���� n��°�� ���ĺ��� ���Ѵ�.
			ch = (char) (ch + n);
			//z���� Ŀ����� -26�� �ؼ� ���ĺ��� ���Ѵ�.
			if(ch > 'z') {
				ch -= 26;
			}
		//�빮�� ���ĵ� �ҹ��ڿ� �Ȱ���.
		} else if(ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + n);
				if( ch > 'Z') {
					ch -= 26;
				}
			}
		//������ ���ĺ��� ������ ��´�.
		result += ch;
		}
		
		System.out.println(result);
		}
		
	}

