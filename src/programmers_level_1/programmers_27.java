package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	/*
	 * ���α׷��ӽ� LEVEL_1 ���ڿ� �� ������� �����ϱ�
	 */
public class programmers_27 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		//������ ������ ����Ʈ�� �����Ѵ�.
		ArrayList<String> arrayList = new ArrayList<>();
		
		//�Է¹��� ���ڿ��� ���̸�ŭ for���� ������.
		for(int i = 0 ; i<strings.length ; i++) {
			//����Ʈ�� �ش��ϴ� ������ ���ڿ��� �տ� �߰��Ͽ� ���ڿ��� ����Ʈ�� �����Ѵ�.
			//ex ) abcd -> babcd
			arrayList.add(strings[i].charAt(n)+strings[i]);
		}
		//����Ʈ�� ���Ľ�Ų��.
		Collections.sort(arrayList);
		
		//����Ʈ�� ���̸�ŭ ������ �迭�� �����Ѵ�.
		String[] answer = new String[arrayList.size()];
		
		//���ĵ� ���ڿ��� �ϳ��� �迭�� �����Ѵ�.
		for(int i=0 ; i < arrayList.size() ; i++) {
			answer[i] = arrayList.get(i).substring(1);
		}
		//���ĵ� �迭�� �����Ѵ�.
		System.out.println(Arrays.toString(answer));
	}

}
