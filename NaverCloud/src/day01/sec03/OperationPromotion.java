package day01.sec03;

public class OperationPromotion {
	public static void main(String[] args) {
		byte result1 = 10 + 20; 	//������ �ܰ迡�� ����
	//	System.out.println("result1: "+ result1 );
		
		byte v1 =10;
		byte v2 = 20;
		int result2 = v1 + v2; 	// int Ÿ������ ��ȯ �� ����
		System.out.println("result2: " + result2);
		
		byte v3 =10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; 	// long Ÿ������ ��ȯ �� ����
		System.out.println("result3: " + result3);
		
		char v6 = '��';
		char v7 =1;
		int result4 = v6 + v7; 	// int Ÿ������ ��ȯ�� ����
		System.out.println("result4: " + result4);
		
		int v8 =10;
		int result5 = v8/4; 	// ������ ���� ����� ����
		System.out.println("result5: " + result5);
		
		int v9 =10;
		double result6 =v9/4.0;		// double Ÿ������ ��ȯ �� ����
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10/v11; 	// double Ÿ������ ��ȯ �� ����
		System.out.println("result7: " + result7);	
		
		// ���� double Ÿ�԰� intŸ���� ����� ���� int �����Ѵٸ� �Ʒ��� ���� �� �� �ִ�.
		int intValue = 10;
		double doubleValue = 5.5;
		int result = intValue + (int) doubleValue; // 10 + 5
		// �� ��� doubleValue�� int�� ��������ȯ���Ͽ� �Ҽ����� ������ 5�� �ȴ�.
		
		// �Ʒ��� ���� ���?
		int x = 1;
		int y = 2;
		double a = x/y;
		System.out.println(a); //0.0 -> intŸ������ ����ϰ� double�� �����ϱ⶧���� 0.0�� �ȴ�.
	}
}
