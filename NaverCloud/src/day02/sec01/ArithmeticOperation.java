package day02.sec01;

public class ArithmeticOperation {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1); // ��� �ǿ����ڴ� int Ÿ������ �ڵ���ȯ �� ���� -> result1 : 14
	
		long result2 = v1 + v2 - v4;
		System.out.println("result2 : " + result2); // ��� �ǿ����ڴ� long Ÿ������ �ڵ���ȯ�� ���� -> result2 : 4
	
		double result3 = (double) v1 /v2;
		System.out.println("result3 : " + result3); // ��� �ǿ����ڴ� doubleŸ������ �ڵ���ȯ�� ���� -> result3 : 2.5
		
		int result4 = v1 % v2;
		System.out.println("result4 : " + result4); // -> result4 : 2
	}

}
