package day02.quiz;

public class Four {

	public static void main(String[] args) {
	//4.1 1~50 ���� �� 6�� ����� ����ض�.(for, if)
	for(int i =1; i<=50; i++) {
		if(i % 6 == 0) {
		System.out.println(i);
	}
			
	//4.2 1~50������ ���� ����ض�.
	int sum = 0;
	for(int j = 1; j <= 50; j++) {
			sum += j;
		}
	System.out.println(sum);
		}		
	
	//4.3 1~50 ������ random�Լ��� ���� ���� �� �� ������ �� �ϳ�(����)����ض�.
	System.out.println((int)(Math.random()*51));
	
	}

}
