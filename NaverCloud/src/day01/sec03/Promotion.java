package day01.sec03;

public class Promotion {

	public static void main(String[] args) {
				
			    // ����
		        /* �ڵ�Ÿ�� ��ȯ
		         * ���� ������ Ÿ���� ū ���� �� Ÿ������ ���ԵǴ°�.
		         * byte(1) < short, char (2) < int (4) < float(4) < double(8byte)
		         * int�� float�� ������ ũ���4byte�� ������ float�� �Ǽ��� �����ϱ⶧���� int���� ������ �� ũ��.
		         * */

		        byte byteValue = 10;
		        int intValue = byteValue;
		        System.out.println("intValue�� �� : " + intValue); // intValue : 10

		        char charValue = '��';
		        intValue = charValue;
		        System.out.println("���� �����ڵ� :" +intValue); // ���� �����ڵ� :44032

		        intValue =50;
		        long longValue = intValue;
		        System.out.println("longValue�� ��: "+longValue); // longValue�� ��: 50

		        longValue = 100;
		        float floatValue = longValue;
		        System.out.println("floatValue�� ��: " + floatValue); // floatValue�� ��: 100.0

		        floatValue = 100.5F;
		        double doubleValue = floatValue;
		        System.out.println("doubleValue�� ��: " + doubleValue ); //doubleValue�� ��: 100.5
	}

}
