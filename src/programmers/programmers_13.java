package programmers;
/*
 * ���α׷��ӽ� LEVEL_1 3���� ������
 */
public class programmers_13 {

	public static void main(String[] args) {
		
		int n =125;
		int answer=0;
		String result = "";
		//�־��� �� n�� 0�̵ɶ����� ������ �Ǻ��Ѵ�.
		 while (n != 0) {
			 //�־��� n�� ������ 3�� ������ result ������ �־��ش�.
			 result += Integer.toString(n % 3);
			 //n�� ��� 3���� ���������� ���� �����Ѵ�.
	            n /= 3;
	        }
		 	System.out.println(result);
		 	//3���� ������������ Integer.parseInt 3���� ��ȯ���� 3���� �������� ������ش�.
	        answer = Integer.parseInt(result, 3);
	        
	        //����� ���(�����Ѵ�).
	        System.out.println(answer); 
	}

}
