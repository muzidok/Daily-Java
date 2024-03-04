package day01.sec03;

import java.util.Scanner;
//import java.util.Scanner;로 맨위에 부럴와야지 오류가 안뜬다. 물론 패키지보다 먼저 불러오면 안된다.

public class ScannerLesson {

	public static void main(String[] args) {
		/* Scanner 는 키보드로부터 입력된 데이터를 읽는 가장쉬운 방법이다.
			사옹방법은 Scanner 타입의 변수를 선언하고, 
			대입연산자 =을 사용해서 new 연산자로 생성한 Scanner객체를 변수에 대입한다.
		*/
		// Scanner sc = new Scanner(System.in);
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("x값 입력: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX); // strX라는 문자열을 정수타입으로 변경 -> 나중에 자세하게 배운다.
		
		System.out.println("y값 입력: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
		
	//입력받기위해서는 반드시 Scanner 객체가 필요하다.

	System.out.println("이름: ");
	String name = sc.next();
	//이름을 입력하여 변수 name에 scanner객체에 입력한값을 대입한다.
	System.out.println("점수: ");
	int com = sc.nextInt();
	// 만약 a,b,c로 나온다면 nextChar();
	System.out.println(name + " " + com);
			
	System.out.println("두 점수 입력");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println("평균" + " " + (a + b)/2.0);
			
	System.out.println("학점 (A,B,C,F) 입력");		
	//char grade = sc.next() // next는 스트링이라서 char 사용 불가
	char grade =sc.next().charAt(0); // 입력된 문자열의 하나의 값만 돌려받겠다. 0은 index 0을 의미한다.
			
	System.out.println(grade);
	}

}
