package day02.sec01;

public class IncDecOperation {

	public static void main(String[] args) {
		/*
		 int x = 1;
		 x++; ++x; // x = x + 1 로 같다.
		 x--; --x; //x = x -1 로 같다.
         int a = 5, b;	
		 ++a, a++ 같이 단독으로 사용하는경우에는 값이같다. 
		 근데 대입연산자가 들어가면 차이점이 보인다.
		 
		 b = a++; // b에 대입 후 a의 값을 1을 증가
		 System.out.println(b); // 대입되고 바로 출력해서 5가 출력됨
		 System.out.println(a); // 대입되고 증가되어서 6
		
		 b = ++a; // a의 값을 증가시키고 b에 대입 
		 System.out.println(b); // 증가시키고 대입하여서 7
		 System.out.println(a); // 증가시키고 대입되어서 똑같이7
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
