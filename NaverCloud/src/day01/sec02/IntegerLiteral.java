package day01.sec02;

public class IntegerLiteral {

	public static void main(String[] args) {
		
		byte s = 127;
		// byte s1 = 128; // byte�� ������ -128 ~ 127 ������ ���� �߻�
		
		int i = 128;
		
		long a1 = 10;
		long b1 = 20L;
		// long c = 1000000000000 // �����Ͼ�� int�� �����ϱ⋚���� ���� �߻�
		long d1 = 1000000000000L;

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(d1);
		
		int a  =10;
		long l = 10l;
		double b =3.4;
		float c =3.4f;
		//float���ٴ� double�� ���̾���.
		
		char d = '��';
		java.lang.String e = "abcde";
		//�ѱ��ڴ� char ������ String =>����Ÿ���̾ƴ϶� Ŭ�����̴�.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(l);
		// "+" �� �������ڿ��̶���Ѵ�. ������ ���ڿ��� �Բ� ����� �� �ִ�.
		System.out.println(a + " " + b);
		System.out.println(a+b);
		
		// ������ ��Ű������ String�̶�� Ŭ�������� ���� ���ϋ����� ������ ��.
		//		String name ="�浿";
		java.lang.String name = "�浿";
		int age = 20;
		double ki = 166.6;
		char blood ='0';
		
		// �浿�� ���̴� 20���̴�.
		System.out.println(name +"�� ���̴� " + age  + "���̴�.");
				
		//�浿�� �������� 0��
		System.out.println(name+ "�� �������� " + blood + "��");
	
	}

}
