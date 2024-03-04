package day01.sec03;

public class Casting {

	public static void main(String[] args) {
		//정리
		/*casting은 강제타입변환을 말한다.
		 *큰 범위를 가지는 타입은 작은범위타입으로 자동 변환할 수 없는데, 
		 *이때 캐스팅연산자()를 사용해서 ()안에 들어갈 타입으로 조각내주는것을 강제타입변환이라한다.
		 */
		
		int i = 10;
		byte b = (byte) i;
		System.out.println(b); // 10
		
		long l = 300;
		int i2 = (int) l;
		System.out.println(i2); // 300
		
		int i3 = 65;
		char c = (char) i3;
		System.out.println(c); // A ->유니코드 67는 대문자 A 이다.
		
		double d = 3.14;
		int i4 = (int) d;
		System.out.println(i4); // 3
	}

}
