package day01.sec03;
import java.util.Scanner;

public class PromotionLesson {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ(Promotion)�� ���� Ÿ���� �������� ū Ÿ������ ���Եɋ� �ڵ������� �߻��Ѵ�.
		
		int var1 = 10;
		byte var2 = (byte) var1; //ū�������ִ� ���� ������������ �ű�. -> ����Ÿ�Ժ�ȯ
		System.out.println(var2);
				
		double var3 = 3.1415671321333213213212321321321;
		int var4 = (int) var3;
		System.out.println(var3);
				
				
		int eng = 100;
		int kor = 95;
		//���� int�� �ϳ��� double�� �ٲٰų� �����°��� �Ҽ������� ���巷�� ������ؾ� ���� ��Ȯ�� ��µȴ�.
		
		double avg = (eng + kor)/2; 
		// 97.5�� ���;��ϴµ� INT���̶� �Ҽ����� ������ double�� �ڵ� �� ��ȯ�̵�.
		double avg2 = (eng + kor)/2.0;
		System.out.println("���" +  avg);
				
		byte b = 127;
		int c = 100;
		System.out.println(b+c);
		System.out.println((byte)b+c); //byte ������ ����Ÿ�� ��ȯ
		System.out.println((int)2.8+1.8); // 2 + 1.8
		System.out.println((int)(2.8+1.8)); //4 
		//��ȣ�� �� �����Ѵ�.

		System.out.println("�̸��� ������ �Է����ּ���");


		Scanner kimsu = new Scanner(System.in);
		//�Է¹ޱ����ؼ��� �ݵ�� Scanner ��ü�� �ʿ��ϴ�.
		//import java.util.Scanner;�� ������ �η��;��� ������ �ȶ��.
		System.out.println("�̸�: ");
		
		String name = kimsu.next();
		//�̸��� �Է��Ͽ� ���� name�� scanner��ü�� �Է��Ѱ��� �����Ѵ�.
		
		System.out.println("����: ");
		int com = kimsu.nextInt();
		
		// ���� a,b,c�� ���´ٸ� nextChar();
		System.out.println(name + " " + com);
				
		System.out.println("�� ���� �Է�");
		int a = kimsu.nextInt();
		int b2 = kimsu.nextInt();
		
		System.out.println("���" + " " + (a + b2)/2.0);
				
		System.out.println("���� (A,B,C,F) �Է�");		
		//char grade = kimsu.next() 		// next�� ��Ʈ���̶� char ��� �Ұ�
		
		char grade =kimsu.next().charAt(0); // �Էµ� ���ڿ��� �ϳ��� ���� �����ްڴ�. 0�� index 0�� �ǹ��Ѵ�.
				
		System.out.println(grade);
			
		}
	}

