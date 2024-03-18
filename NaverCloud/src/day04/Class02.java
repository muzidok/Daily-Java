package day04;

public class Class02 {

	public static void main(String[] args) {
	//static �ϳ��� Ŭ�������� �Լ��� �����ϱ����ؼ� ����Ѵ�. void�� ��ȯ���� ����. 
	// ��ȯ���� void�̸� �Լ��� ��κ� ��¹��� ����.	
	// �޼ҵ�� �ݵ�� Ŭ���� �ȿ� �־�� �Ѵ�.(ĸ��ȭ�� ��Ģ - ���� ���ж����� �ʿ��ϴ�)
	
		//	pro(2); // ������ ȣ�� -> �Լ��� {}(�����) �� ã�� Ȯ���Ѵ�.
		//	pro(53);
		//	System.out.println("��");

	// ���� ��� ���� �ȳ� ���̴� 2�̴� �ȳ� ���̴� 53�̴� ��
	//������ ���� ã�� �׾ȿ��� �Լ��� ã�Ƽ� �����Ѵ�.


=========================================================================================

/* �Լ����� �ߎ��� ��𿡼� �Ұ��ΰ�
 * 1. main���� ����ҰŶ�� �Լ����� ����
 * -> �Լ� ȣ��� ���ÿ� ����� �����ϴ�.
 * -> ������ �ָ鼭 ���ϰ�������.
 * 2. �ϼ����� �ҰŶ�� ���͹��� �ʿ����.(void)
 * 
 * */

	static void total(int a, int b) { // �Ű������� �ڷ����� ���� ��������Ѵ�.
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		total(1, 10);
		total(1, 100);
		// 1`10���� ���
		// 1-100���� �� ���
	}
}

=========================================================================================

////main�� ����ϱ� -> �Լ����� �����ؾ���
public class Day4_2 {

	public static void main(String[] args) {
		System.out.println(multi(2, 10)); // 2�� �ؼ��� 10�� ������.
	}

	static int multi(int a, int b) {
		int m = 1;
		for (int i = 1; i <= b; i++) {
			m *= a;
		}
		return m;
	}
}

public class Day4_2 {

	public static void main(String[] args) {
		System.out.println(big(5.5, 6.5));
	}

	// �� ���� ū ���� ����ϴ� �Լ��� ���׿����ڸ� Ȱ��
	static double big(double a, double b) {
		return a > b ? a : b;
	}
}

=========================================================================================

// ���� ������ ��������

public class Day4_2 {

	static void in() {
		int a = 10; // ��������
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 0; // ��������(local variables)
		in(); // �Լ� ȣ��
		System.out.println(a);
	}

}

=========================================================================================

public class Day4_2 {

	public static void main(String[] args) {
		aa(); // 10
		b();
		c(); // 20 ���������� �о���⶧���� ���� �������� ������ a�� ��µȴ�.
		System.out.println(a);
	}

	static int a; // static�� �����ϰڴٴ� ������ �����������Ǿ� a ����� �޶�����.

	static void aa() {
		a = 10;
	}

	static void b() {
		int a = 20; // �������� �� b �Լ����ο����� ����� �� �ִ�.
	}

	static void c() {
		a = 20;
	}

}

	=========================================================================================

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ������ 7�� ���� �� �ִ� �迭a ����
		int arr[] = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(big(arr)); // 7�� �� ���� ū �� ���
		// �Ű������� �迭���϶�
		// �迭�� ȣ���� �� �迭�� �� ������ ��
	}
}

=========================================================================================

public class Day4_2 {

	static int in() {
		// �Էµ� ������ ������ּ���.
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}

	public static void main(String[] args) {
		System.out.println(in());
	}
}

// �� ���� ��򰡿��� �����µ� �迭�� �Լ������ �κ��ΰ�..?�Լ��� ����� �κп��� �ΰ�..?
//public class Day4_2 {
//	
//static int total (int b[]) {
//	int sum = 0;
//	for(int i=0; i<b.length; i++) {
//		sum += b[i];
//	}
//	return sum;
//}
//	
//	public static void main(String[] args) {
//		
//		int arr [] = {1,2,3,4,5};
//		System.out.println(total(arr));
//		
//	}
//}

// ���������̶� ������ ..?
public class Day4_2 {
	public static void main(String[] args) {
		int arr[] = {3,2,1,6,5};
		
		for(int i =0; i <4; i++) { // i�� �迭�� ���̷��ϸ� j�� �迭�� ���̸� �ʰ��ϴϱ� 1�۰� ��.
			int temp; // i�� j�� ���� �ٲܶ� �ϳ��� �ٸ� ���� �����ϸ� �ٸ����� ������ �ּҸ� �ؾ�����ϱ� �ӽ÷� �����Ϸ��� ����.
			for(int j = i+1; j < 5; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}

}

}
