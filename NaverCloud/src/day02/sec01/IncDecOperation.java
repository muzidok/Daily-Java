package day02.sec01;

public class IncDecOperation {

	public static void main(String[] args) {
		/*
		 int x = 1;
		 x++; ++x; // x = x + 1 �� ����.
		 x--; --x; //x = x -1 �� ����.
         int a = 5, b;	
		 ++a, a++ ���� �ܵ����� ����ϴ°�쿡�� ���̰���. 
		 �ٵ� ���Կ����ڰ� ���� �������� ���δ�.
		 
		 b = a++; // b�� ���� �� a�� ���� 1�� ����
		 System.out.println(b); // ���Եǰ� �ٷ� ����ؼ� 5�� ��µ�
		 System.out.println(a); // ���Եǰ� �����Ǿ 6
		
		 b = ++a; // a�� ���� ������Ű�� b�� ���� 
		 System.out.println(b); // ������Ű�� �����Ͽ��� 7
		 System.out.println(a); // ������Ű�� ���ԵǾ �Ȱ���7
		 */
		
		int x = 10;
		int y = 10;
		int z ;
		
		x++; //11
		++x; //12
		
		System.out.println("x = " + x); //12
		System.out.println("------------------");
		
		y--; //9
		--y; //8
		
		System.out.println("y = " + y); //8
		System.out.println("------------------");
		
		z = x++;
		System.out.println("z = " + z); //12
		System.out.println("x = " + x); //13
		System.out.println("------------------");
	
		z = ++x;
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); //14
		System.out.println("------------------");
		
		z = ++x + y++;
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); //9
		System.out.println("z = " + z); //23
	}

}
