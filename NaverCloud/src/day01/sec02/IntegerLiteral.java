package day01.sec02;

public class IntegerLiteral {

	public static void main(String[] args) {
		
		byte s = 127;
		// byte s1 = 128; // byte의 범위는 -128 ~ 127 까지라서 에러 발생
		
		int i = 128;
		
		long a1 = 10;
		long b1 = 20L;
		// long c = 1000000000000 // 컴파일어는 int로 간주하기떄문에 에러 발생
		long d1 = 1000000000000L;

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(d1);
		
		int a  =10;
		long l = 10l;
		double b =3.4;
		float c =3.4f;
		//float보다는 double을 많이쓴다.
		
		char d = '가';
		java.lang.String e = "abcde";
		//한글자는 char 문장은 String =>원시타입이아니라 클래스이다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(l);
		// "+" 는 나열문자열이라고도한다. 변수와 문자열을 함께 출력할 수 있다.
		System.out.println(a + " " + b);
		System.out.println(a+b);
		
		// 동일한 패키지내에 String이라는 클래스명을 가진 파일떄문에 에러가 남.
		//		String name ="길동";
		java.lang.String name = "길동";
		int age = 20;
		double ki = 166.6;
		char blood ='0';
		
		// 길동의 나이는 20살이다.
		System.out.println(name +"의 나이는 " + age  + "살이다.");
				
		//길동의 혈액형은 0형
		System.out.println(name+ "의 혈액형은 " + blood + "형");
	
	}

}
