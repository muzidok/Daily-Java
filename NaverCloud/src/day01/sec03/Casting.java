package day01.sec03;

public class Casting {

	public static void main(String[] args) {
		//����
		/*casting�� ����Ÿ�Ժ�ȯ�� ���Ѵ�.
		 *ū ������ ������ Ÿ���� ��������Ÿ������ �ڵ� ��ȯ�� �� ���µ�, 
		 *�̶� ĳ���ÿ�����()�� ����ؼ� ()�ȿ� �� Ÿ������ �������ִ°��� ����Ÿ�Ժ�ȯ�̶��Ѵ�.
		 */
		
		int i = 10;
		byte b = (byte) i;
		System.out.println(b); // 10
		
		long l = 300;
		int i2 = (int) l;
		System.out.println(i2); // 300
		
		int i3 = 65;
		char c = (char) i3;
		System.out.println(c); // A ->�����ڵ� 67�� �빮�� A �̴�.
		
		double d = 3.14;
		int i4 = (int) d;
		System.out.println(i4); // 3
	}

}
