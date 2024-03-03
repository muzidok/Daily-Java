package day01.sec01;

public class VariableInitialization {

	public static void main(String[] args) {
		// 동일한 패키지내에서 에러가 있는 소스파일이있으면 다른 부분에서도 에러가 발생한다.

		//int a; // 변수 a를 선언
		//int sum = a +10; 
		/* 초기화를 하지않아서 a라는 변수에는 아직 메모리가 할당되지않아 
		 * 변수를 통해 메모리를 읽을 수 없어 컴파일 에러가 난다.
		*/
		
		int b = 10; //정수형 변수 b 를 10 으로 초기화
		
		System.out.println( b + 10); // 20 출력 후 줄 바꿈

		int age = 30;
		// 자료형 변수명 = 데이터값;
		// 30을 age에 대입한다(o). age는 30이다.(x)
		System.out.println(age);
		
	}

}
