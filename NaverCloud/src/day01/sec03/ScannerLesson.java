package day01.sec03;

import java.util.Scanner;
//import java.util.Scanner;�� ������ �η��;��� ������ �ȶ��. ���� ��Ű������ ���� �ҷ����� �ȵȴ�.

public class ScannerLesson {

	public static void main(String[] args) {
		/* Scanner �� Ű����κ��� �Էµ� �����͸� �д� ���彬�� ����̴�.
			��˹���� Scanner Ÿ���� ������ �����ϰ�, 
			���Կ����� =�� ����ؼ� new �����ڷ� ������ Scanner��ü�� ������ �����Ѵ�.
		*/
		// Scanner sc = new Scanner(System.in);
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("x�� �Է�: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX); // strX��� ���ڿ��� ����Ÿ������ ���� -> ���߿� �ڼ��ϰ� ����.
		
		System.out.println("y�� �Է�: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		while(true) {
			System.out.println("�Է� ���ڿ�: ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("��¹��ڿ�: " + data);
			System.out.println();
		}
		System.out.println("����");
		
		
	//�Է¹ޱ����ؼ��� �ݵ�� Scanner ��ü�� �ʿ��ϴ�.

	System.out.println("�̸�: ");
	String name = sc.next();
	//�̸��� �Է��Ͽ� ���� name�� scanner��ü�� �Է��Ѱ��� �����Ѵ�.
	System.out.println("����: ");
	int com = sc.nextInt();
	// ���� a,b,c�� ���´ٸ� nextChar();
	System.out.println(name + " " + com);
			
	System.out.println("�� ���� �Է�");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println("���" + " " + (a + b)/2.0);
			
	System.out.println("���� (A,B,C,F) �Է�");		
	//char grade = sc.next() // next�� ��Ʈ���̶� char ��� �Ұ�
	char grade =sc.next().charAt(0); // �Էµ� ���ڿ��� �ϳ��� ���� �����ްڴ�. 0�� index 0�� �ǹ��Ѵ�.
			
	System.out.println(grade);
	}

}
