package programmers_level_1;

public class programmers_7 {
	/*
	 *  ���α׷��ӽ� LEVEL_1 �ű� ���̵� ��õ
	 */
	public static void main(String[] args) {

		/*
		 *  1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
			2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
			3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
			4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
			5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
			6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
			     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
			7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		 */
		String new_id = "..!@BaT#*..y.abcdefghijklm";
		
		new_id = new_id.toLowerCase();
		System.out.println("1�ܰ� - �빮�ڸ� �ҹ��ڷ� ġȯ :"+new_id);
		
		new_id = new_id.replaceAll("[^a-z\\d\\-_.]*", "");
		System.out.println("2�ܰ� - �ҹ���,����,����,����,����,��ħǥ ���� : "+new_id);
		
		new_id = new_id.replaceAll("[.]{2,}", ".");
		System.out.println("3�ܰ� - ��ħǥ�� 2���̻��϶� �ϳ��� ��ħǥ�� ġȯ : "+new_id);
		
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		System.out.println("4�ܰ� - ��ħǥ�� ó���̳� ���� ��ġ�ϸ� ���� : "+new_id);
		
		if(new_id.equals("")) {
			new_id = "a";
		}
		System.out.println("5�ܰ� - �� ���ڿ��̶�� a�� ���� : "+new_id);
		
		if(new_id.length()>=16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		System.out.println("6�ܰ� - ���̰� 16�� �̻��̸� 15���� ���ڷ� �ڸ��� + 4�ܰ� : "+ new_id);
		if(new_id.length() <=2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
		
		System.out.println("7�ܰ� - ���̰� 2�� ���϶�� ������ ���ڸ� ���̰� 3�ϵɶ����� �ݺ� : "+new_id);
	}

}
