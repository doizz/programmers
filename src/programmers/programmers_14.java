package programmers;
/*
 * ���α׷��ӽ� LEVEL_1 ����� ������ ����
 */
public class programmers_14 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int count = 0;
		int result = 0;
		//left�� �� ���� right�� ������ 1�� ������Ų��.
		for(int i = left ; i <= right ; i++ ) {
			//left�� ������ ����� �Ǻ��ϱ����ؼ� 1���� left������ 1�� ������Ų��.
			for(int j = 1 ; j <= i ; j++) {
				//left�� �� ������ 1�� �����Ǵ¼��� ������� �Ǻ��Ѵ�.
				if( i % j == 0) {
					//����� ������ ī��Ʈ�� ������Ų��.
					count++;
				}
			}
			//����� ¦���� �ÿ��� +�� �ƴҽÿ��� -�� �Ͽ� �հ踦 ���Ѵ�.
			result += (count%2==0) ? i*1 : i*-1;
			//count ������ �ʱ�ȭ ��Ų��.
			count=0;
		}
		System.out.println(result);
	}

}
