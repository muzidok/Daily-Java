package day01.sec02;

public class Casting {

	public static void main(String[] args) {
		byte byteValue = 10;
		// 1byte
		int intValue = byteValue; //자동타입변환 : 오른쪽이 왼쪽보다 작으면 자동으로 변환된다고 생각하자.
		// 4byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		
		float var4 =10.4f;
		System.out.println(var4);

	}

}
