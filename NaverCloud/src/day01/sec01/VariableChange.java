package day01.sec01;

public class VariableChange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		System.out.println("x: " + x + "," + "y: " + y); //x: 3,y: 5

		int temp = x; // 변경할 값을 임시로 저장하기위한 변수 temp 선언
		x = y;
		y = temp;
		
		System.out.println("x: " + x + "," + "y: " + y); //x: 5,y: 3
		/*
		 int x = y와  int y = x는 왜 안될까?
		 */
	}

}
