package day01.sec01;

public class VariableChange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		System.out.println("x: " + x + "," + "y: " + y); //x: 3,y: 5

		int temp = x; // ������ ���� �ӽ÷� �����ϱ����� ���� temp ����
		x = y;
		y = temp;
		
		System.out.println("x: " + x + "," + "y: " + y); //x: 5,y: 3
		/*
		 int x = y��  int y = x�� �� �ȵɱ�?
		 */
	}

}
