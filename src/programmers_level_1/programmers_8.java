package programmers_level_1;

public class programmers_8 {
	/*
	 * ���α׷��ӽ� LEVEL_1 ���� ���ϱ�
	 */
	public static void main(String[] args) {

		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int sum=0;
		
		for(int i=0 ; i<absolutes.length ; i++) {
			//signs �迭�� ����ִ°� ���ϰ�� +�� �����ϰ�� -������ �����Ѵ�.
			if(signs[i]) {
				sum += absolutes[i];
			} else {
				sum -= absolutes[i];
			}
		}
		
		System.out.println(sum);
	}

}
