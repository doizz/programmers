package programmers;

public class programmers_17 {
	/*
	 * ���α׷��ӽ� LEVEL_1 2016��
	 */
	public static void main(String[] args) {
		  int total = 0;
		  //������ ��ȯ�� �迭�� �����Ѵ�.
	      String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      //�ϼ� üũ������ �迭�� �����Ѵ�.
	      int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
	      //�־��� ���� 5, 24�� �����Ѵ�.
	      int a=5;
	      int b=24;
	      //�������� �ش��ϴ� ���� ���� �ϼ��� ���Ѵ�.
	      for(int i =0;i<a-1;i++){
	          total += m[i];
	      }
	      //�ش��ϴ� ������ �ϼ��� ���ش�.
	      total += b-1;
	      //��ü�Ͽ��� ������ 7�� �Ͽ� ������ ���Ѵ�.
	      String answer = w[total%7];
	      //������ ��ȯ�Ѵ�.
	      System.out.println(answer);
		
	}

}
