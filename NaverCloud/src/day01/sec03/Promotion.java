package day01.sec03;

public class Promotion {

	public static void main(String[] args) {
				
			    // 정리
		        /* 자동타입 변환
		         * 작은 범위의 타입이 큰 범위 의 타입으로 대입되는것.
		         * byte(1) < short, char (2) < int (4) < float(4) < double(8byte)
		         * int와 float의 데이터 크기는4byte로 같지만 float이 실수를 포함하기때문에 int보다 범위가 더 크다.
		         * */

		        byte byteValue = 10;
		        int intValue = byteValue;
		        System.out.println("intValue의 값 : " + intValue); // intValue : 10

		        char charValue = '가';
		        intValue = charValue;
		        System.out.println("가의 유니코드 :" +intValue); // 가의 유니코드 :44032

		        intValue =50;
		        long longValue = intValue;
		        System.out.println("longValue의 값: "+longValue); // longValue의 값: 50

		        longValue = 100;
		        float floatValue = longValue;
		        System.out.println("floatValue의 값: " + floatValue); // floatValue의 값: 100.0

		        floatValue = 100.5F;
		        double doubleValue = floatValue;
		        System.out.println("doubleValue의 값: " + doubleValue ); //doubleValue의 값: 100.5
	}

}
