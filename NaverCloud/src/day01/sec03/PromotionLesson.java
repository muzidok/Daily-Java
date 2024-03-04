package day01.sec03;
import java.util.Scanner;

public class PromotionLesson {

	public static void main(String[] args) {
		// 자동타입변환(Promotion)은 작은 타입이 허용범위가 큰 타입으로 대입될떄 자동적으로 발생한다.
		
		int var1 = 10;
		byte var2 = (byte) var1; //큰공간에있는 값을 작은공간으로 옮김. -> 강제타입변환
		System.out.println(var2);
				
		double var3 = 3.1415671321333213213212321321321;
		int var4 = (int) var3;
		System.out.println(var3);
				
				
		int eng = 100;
		int kor = 95;
		//위의 int중 하나를 double로 바꾸거나 나누는값을 소수점으로 만드렁서 계산을해야 값이 정확히 출력된다.
		
		double avg = (eng + kor)/2; 
		// 97.5가 나와야하는데 INT형이라서 소수점을 버리고 double로 자동 형 변환이됨.
		double avg2 = (eng + kor)/2.0;
		System.out.println("평균" +  avg);
				
		byte b = 127;
		int c = 100;
		System.out.println(b+c);
		System.out.println((byte)b+c); //byte 형으로 강제타입 변환
		System.out.println((int)2.8+1.8); // 2 + 1.8
		System.out.println((int)(2.8+1.8)); //4 
		//괄호를 잘 봐야한다.

		System.out.println("이름과 점수를 입력해주세요");


		Scanner kimsu = new Scanner(System.in);
		//입력받기위해서는 반드시 Scanner 객체가 필요하다.
		//import java.util.Scanner;로 맨위에 부럴와야지 오류가 안뜬다.
		System.out.println("이름: ");
		
		String name = kimsu.next();
		//이름을 입력하여 변수 name에 scanner객체에 입력한값을 대입한다.
		
		System.out.println("점수: ");
		int com = kimsu.nextInt();
		
		// 만약 a,b,c로 나온다면 nextChar();
		System.out.println(name + " " + com);
				
		System.out.println("두 점수 입력");
		int a = kimsu.nextInt();
		int b2 = kimsu.nextInt();
		
		System.out.println("평균" + " " + (a + b2)/2.0);
				
		System.out.println("학점 (A,B,C,F) 입력");		
		//char grade = kimsu.next() 		// next는 스트링이라서 char 사용 불가
		
		char grade =kimsu.next().charAt(0); // 입력된 문자열의 하나의 값만 돌려받겠다. 0은 index 0을 의미한다.
				
		System.out.println(grade);
			
		}
	}

