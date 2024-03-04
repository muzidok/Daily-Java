package day01.sec03;

public class PrintPrintf {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ����: %d�� \n", value); //��ǰ�� ����: 123�� 
		System.out.printf("��ǰ�� ����: %6d�� \n", value); // ��ǰ�� ����:    123��
		System.out.printf("��ǰ�� ����: %-6d�� \n", value); // ��ǰ�� ����: 123   �� 
		System.out.printf("��ǰ�� ����: %06d�� \n", value); // ��ǰ�� ����: 000123�� 

		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f\n", 10,  area); // �������� 10�� ���� ����:     314.16
		
		String name ="ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); //     1 | ȫ�浿        |         ����
	}

}
