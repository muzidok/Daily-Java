package day02.sec01;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a = 5, b;
		
	//	++a, a++ ���� �ܵ����� ����ϴ°�쿡�� ���̰���. �ٵ� ���Կ����ڰ� ���� �������� ���δ�.
	b = a++; // b�� ���� �� a�� ���� 1�� ����
	System.out.println(b); // ���Եǰ� �ٷ� ����ؼ� 5�� ��µ�
	System.out.println(a); // ���Եǰ� �����Ǿ 6
	
	b = ++a; // a�� ���� ������Ű�� b�� ���� 
	System.out.println(b); // ������Ű�� �����Ͽ��� 7
	System.out.println(a); // ������Ű�� ���ԵǾ �Ȱ���7

	
	System.out.println('a' > 'b');//�񱳿����ڴ� ������� boolean�̴�.
	System.out.println((2>3) &&  (3==3)); // �Ѵ� �Ǿƾ��� ���̵ȴ�. false
	System.out.println((2>3) ||  (3==3)); //�ϳ��� �ǾƵ� ���̵ȴ�. true
	
	int score = 85; // �������� ���ÿ� �ʱ�ȭ
	if(score >= 90) { // �����̶� �����̵����ʰ� else������ �Ѿ��.
		System.out.println("������ 90���� Ů�ϴ�"); 
		System.out.println("����� A�Դϴ�");
	}else { // else�� if�� �ݴ��̱⶧���� ���⿡ ������ �ɸ� ������ ����.
		System.out.println("������ 90���� �۽��ϴ�.");
		System.out.println("����� B�Դϴ�.");
	}
	
	int a1=10,b1=5;
	if(a1 == 10) { //���̱⶧���� �غκ� ������ Ȯ����
		System.out.println("A");
	}else if (a1<b1) { // a != 10 && a <b
		System.out.println("B");
	}else if(a1>b1) { // a != 10 && a>b
		System.out.println("C");
	}
	
	/*
	Scanner sc = new Scanner(System.in); // ǥ�� �Է� ��Ʈ��		
	System.out.println("������ �Է����ּ���");
	int kor = sc.nextInt(); // ������ �Է��ؼ� ���� kor�� ����
	
	char grade;	
	if(kor >= 90) { //�Է��� ������ 90���� ū��� ����Ȯ��
		grade ='A';
	}else if (kor >= 80) {
		grade ='B';
	}else if(kor >= 70) {
		grade ='C';
	}else 	
	grade ='F';
	// ���׿����� ���
	char grade = (kor >= 90) ? 'A' : (kor >= 80) ? 'B' : (kor >= 70) ? 'C' : 'F';
	System.out.println("����" + grade);
	*/
	
	
	int total =300;
	double avg = total/3.0;
	double avg2 = total/3; // int  / int �� �� ��Ÿ����.
	System.out.println(avg);
	System.out.println(avg2);
	
	if(avg >= 90) {
		System.out.println("A");
	}else if(80 <= avg && avg < 90) {//��������(����)
		System.out.println("B");
	}
	
	// ��øif��
	int a2 = 20, b2 = 10;
	// ��øif���� �ٱ�if���� ���̾�� ���� if���� Ȯ�ΰ����ϴ�.
	if(a2<10) {
		if(b2>=0) { // ������ true�ϰ�� 5  1
			b2 =1;
		}else { // b�� 0���� �۴ٸ� ����
			b2 = -1;
		}
	}// ������ �����̶� �ƿ� ���� if���� �� ��ŵ�ع���
	System.out.println(a2 + " "+ b2); 
	
	int age = 25,kg=65;
	char size;
	
	if(age < 20) {
		if(kg < 50) {
			size = 's';
		}
		else if (kg < 60) {
			size ='m';
		}
		else {
			size = 'l';
		}
	}else {
		if(kg < 60) {
			size = 's';
		}
		else if (kg < 70) {
			size ='m';
		}
		else {
			size = 'l';
		}
	}
	System.out.println(size);
	
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("�����Է�");
	int score = sc.nextInt();
		
	System.out.println("�г� �Է�");
	int grade = sc.nextInt();
	
	if(score >= 60) {
	if(grade != 4) {
		System.out.println("�հ�");
	}else if(score >= 70) {
		System.out.println("�հ�");
	}
	}else {
	System.out.println("���հ�");
	}
	 */
	
	// switch ��
	// �������� ���� ���๮�� �����ȴ�.
	int num = (int) (Math.random()*10) + 1;
	
	switch (num) {
		case 1: 
		case 10: //int num�� 1�̰ų� 10�̶��
			System.out.println("1��");
		case 2: 
			System.out.println("2��");
		case 3: 
			System.out.println("3��");
		case 4: 
			System.out.println("4��");
			break;
		default : // if-else���� else�� ���� ������ �Ѵ�.
			System.out.println("5��");
			
	// �ڹ� 12 �������ĺ��ʹ� ǥ���� ����� ����������.
	//case 1, 10 -> {};
	}
	}

}
