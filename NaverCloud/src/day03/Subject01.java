package day03;
import java.util.Scanner;

public class Subject01 {

	public static void main(String[] args) {

		// 1. Hello,Java ����غ���
		System.out.println("Hello, Java");
		
		int age = 30;
		// �ڷ��� ������ = �����Ͱ�;
		// 30�� age�� �����Ѵ�(o). age�� 30�̴�.(x)
		System.out.println(age);

		//Q. ������ ����? ���ٸ� ��?
		//	int value; // �ʱ�ȭ �����ʾƼ� ������ ����.
		//	int result = value + 10;
		//	System.out.println(result);
				
		int a  =10;
		long l = 10l;
		double b =3.4;
		float c =3.4f;
		//float���ٴ� double�� ���̾���.
		
		char d = '��';
		String e = "abcde";
		//�ѱ��ڴ� char ������ String =>����Ÿ���̾ƴ϶� Ŭ�����̴�.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(l);
		// + �� �������ڿ�?�̶���Ѵ�. ������ ���ڿ��� �Բ� ����� �� �ִ�.
		System.out.println(a + " " + b);
		System.out.println(a+b);
				
		String name ="�浿";
		int age2 = 20;
		double ki = 166.6;
		char blood ='0';
		
		// �浿�� ���̴� 20���̴�.
		System.out.println(name +"�� ���̴� " + age2  + "���̴�.");
				
		//�浿�� �������� 0��
		System.out.println(name+ "�� �������� " + blood + "��");
				
		byte byteValue = 10;
		// 1byte
		int intValue = byteValue; //�ڵ�Ÿ�Ժ�ȯ : �������� ���ʺ��� ������ �ڵ����� ��ȯ�ȴٰ� ��������.
		// 4byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println(intValue);
		
		
		float var4 =10.4f;
		System.out.println(var4);
		
				
		int var1 = 10;
		byte var2 = (byte) var1; //ū�������ִ� ���� ������������ �ű�. -> ����Ÿ�Ժ�ȯ
		System.out.println(var2);
				
		double var3 = 3.1415671321333213213212321321321;
		int var5 = (int) var3;
		System.out.println(var3);
		System.out.println(var5);
				
				
		int eng = 100;
		int kor = 95;
		//double avg = (eng + kor)/2; 
		// 97.5�� ���;��ϴµ� INT���̶� �Ҽ����� ������ double�� �ڵ� �� ��ȯ�̵�.
		double avg = (eng + kor)/2.0;
		//���� int�� �ϳ��� double�� �ٲٰų� �����°��� �Ҽ������� ���巷�� ������ؾ� ���� ��Ȯ�� ��µȴ�.
		System.out.println("���" +  avg);
				
		byte b2 = 127;
		int c2 = 100;
		System.out.println(b2+c2);
		System.out.println((byte)b2+c2); //byte ������ ����Ÿ�� ��ȯ
		System.out.println((int)2.8+1.8); // 2 + 1.8
		System.out.println((int)(2.8+1.8)); //4 
		//��ȣ�� �� �����Ѵ�.

		System.out.println("�̸��� ������ �Է����ּ���");


		Scanner kimsu = new Scanner(System.in); 
		//�Է¹ޱ����ؼ��� �ݵ�� Scanner ��ü�� �ʿ��ϴ�.
		//import java.util.Scanner;�� ������ �η��;��� ������ �ȶ��.
		System.out.println("�̸�: ");
		String name2 = kimsu.next();
		//�̸��� �Է��Ͽ� ���� name�� scanner��ü�� �Է��Ѱ��� �����Ѵ�.
		System.out.println("����: ");
		int com = kimsu.nextInt();
		// ���� a,b,c�� ���´ٸ� nextChar();
		System.out.println(name2 + " " + com);
				
		System.out.println("�� ���� �Է�");
		int a3 = kimsu.nextInt();
		int b3 = kimsu.nextInt();
		
		System.out.println("���" + " " + (a3 + b3)/2.0);
				
		System.out.println("���� (A,B,C,F) �Է�");		
		//char grade = kimsu.next() // next�� ��Ʈ���̶� char ��� �Ұ�
		char grade =kimsu.next().charAt(0); // �Էµ� ���ڿ��� �ϳ��� ���� �����ްڴ�. 0�� index 0�� �ǹ��Ѵ�.
				
		System.out.println(grade);
				
		System.out.println(10/4.0);

        String a1 ="�达";
        String a2 = "�达";
        String a4 = new String("�达");
        boolean result = a1.equals(a2);
        boolean result2 = a1.equals(a4);
        System.out.println(result);
        System.out.println(result2);



	}

}
