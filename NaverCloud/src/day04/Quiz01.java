package day04;

public class Quiz01 {
	// 1.

	static double area(double r) {
		return 3.14 * r * r;
	}

	static double round(double r) {
		return 3.14 * 2 * r;
	}

	public static void main(String[] args) {
		System.out.println("���� ����" + area(3.5));
		System.out.println("���� �ѷ�" + round(4.5));

		// ���� : 3.14*������*������
		// �ѷ� : 3.14*2*������

	}

	====================================================================================================
//public class Day4_Test {

	public static void main(String[] args) {
	// 5.1) 3�� 3�� �迭�� 0~8���������� �ʱ�ȭ�ض�. -> �ʱ�ȭ�ϱ� nw �Ƚᵵ�ȴ�. [3][3]�� �����Ҷ� �� �� �ְ� �ʱ�ȭ�� ���� ��������. 
		int [][] arr = {{0,1,2},{3,4,5},{6,7,8}};
	
		// 5.2) 2�� 3�� �迭�� a~f�������ڷ� �ʱ�ȭ�ض�.
		char [][] ch = {{'a','b','c'},{'d','e','f'}};
		
	/*1. 3�� 4���������� �迭�� �����Ͽ� 0~9 ������������ �����ϰ� �����Ѵ�.
	������ 2���� �迭�� ���� ����ض�.
	������) 5 4 1 5
	0 5 3 5
	7 8 1 4
	���� 48 
	 */

		int [][] a = new int [3][4];
		int sum =0;
		
		for(int i =0; i<a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				int b =(int)(Math.random()*9)+1;
				a[i][j] = b;
				sum += b;
			}
		}
		System.out.println(sum);

		// 3. main�Լ��� ���� adder, exp�Լ��� �ۼ��ض�.
		//	main()
		//	int result = adder(10,20); // �μ��� �� ���
		//	System.out.println(result);
		//	System.out.println(exp(3.5)); // 3.5�� ������ �� ���
		
		public class Day4_Test {
			
			static int adder(int a, int b) {
				return a + b;
			}
			
			static double exp (double a) {
				return a*a;
			}
			
			public static void main(String[] args) {
				int a = adder(10, 20);
				double b = exp(3.5); 
				System.out.println(a);
				System.out.println(b);
			}
		}
	
====================================================================================================
		
		// 4. ���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ带 ������.
		// (�޼ҵ���� ����)
		
		// 4.1 ����� main���� �ϱ�
		public class Day4_Test {

			static double area (double r){
				return 3.14*r*r;
			}
			
			public static void main(String[] args) {
				System.out.println(area(3));
			}
		}
		
		// 4.2 ����� �޼ҵ�ȿ��� �ϱ� -> �̰� ���������� �𸣰���
		// �Լ��� �ٸ������� �ۼ��ϰ�  public main �ȿ��� �Լ��̸��� �ҷ����� ���ε�?
		public class Day4_Test {	
			public static void main(String[] args) {
				System.out.println(area(3));		
				static int area (int a) {
					return 3.14*a*a;
				}
			}
		}

	====================================================================================================

	// 5-1

	static double are(double a) {
	return e.14*a*a;	
	}public static....

	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		double r = s.nextDouble();

		System.out.println(area(r));

	}

	====================================================================================================

	// �ܼ��ڸ�ŭ�� ���ϱ�
	for(int i = 1;i<=9;i++)
	{
		for (int j = 1; j <= i; j++) {
			if (i % 2 != 0) {
				break;
			}
			System.out.printf("%d*%d=%d\n", i, j, i * j);
		}
		system.out.println();
	}

}
