package programmers;
	/*
	 * ���α׷��ӽ� LEVEL_1 (�ڵ��� ��ȣ ������) 
	 */
public class programmers_41 {

	public static void main(String[] args) {
		String num = "02154231851";
		//�Է¹��� ���� �ѱ��ھ� �߶� �迭�� ��´�.
		String[] arr = num.split("");
		
		String answer = "";
		//�迭�� ���̸�ŭ �ݺ����� �����Ѵ�.
		for(int i=0 ; i<arr.length ; i++) {
			//i�� �迭�Ǳ���-4���� �۴ٸ� * ǥ�ø��Ѵ�.
			if(i < arr.length-4) {
				answer += "*";
			} else {
			//i�� �迭�Ǳ���-4���� ũ�ٸ� ���ڸ� ǥ�ø��Ѵ�.
				answer += arr[i];
			}
		}
		//����ŷó���� ���� �����Ѵ�.
		System.out.println(answer);
	}

}
