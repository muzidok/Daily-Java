package day02.sec01;

public class Over_Under_flow {

	public static void main(String[] args) {
		/* �����÷ο�?
		 * Ÿ���� ����ϴ� �ִ밪�� ����°�
		 * ��� �÷ο�?
		 * Ÿ���� ����ϴ� �ּҰ��� ����°�  
		 * ������� �ִ밪�� �Ѱų� �ּҰ����� ������� ������ �����, ����� ������ �ٲ�°��� �����÷ο���Ѵ�.
		 */
		
	    int num = 10;
	    int maxNum = Integer.MAX_VALUE; // ������ ������ �ִ� �ִ밪
	    
	    System.out.println(num + 1); // 11
	    System.out.println(maxNum + 1); // -2147483648
	}

}
