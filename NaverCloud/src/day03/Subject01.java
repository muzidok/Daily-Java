package day03;
import java.util.Scanner;

public class Subject01 {

	public static void main(String[] args) {

		// 1. Hello,Java 출력해보기
		System.out.println("Hello, Java");
		
		int age = 30;
		// 자료형 변수명 = 데이터값;
		// 30을 age에 대입한다(o). age는 30이다.(x)
		System.out.println(age);

		//Q. 오류가 날까? 난다면 왜?
		//	int value; // 초기화 하지않아서 오류가 난다.
		//	int result = value + 10;
		//	System.out.println(result);
				
		int a  =10;
		long l = 10l;
		double b =3.4;
		float c =3.4f;
		//float보다는 double을 많이쓴다.
		
		char d = '가';
		String e = "abcde";
		//한글자는 char 문장은 String =>원시타입이아니라 클래스이다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(l);
		// + 는 나열문자열?이라고도한다. 변수와 문자열을 함께 출력할 수 있다.
		System.out.println(a + " " + b);
		System.out.println(a+b);
				
		String name ="길동";
		int age2 = 20;
		double ki = 166.6;
		char blood ='0';
		
		// 길동의 나이는 20살이다.
		System.out.println(name +"의 나이는 " + age2  + "살이다.");
				
		//길동의 혈액형은 0형
		System.out.println(name+ "의 혈액형은 " + blood + "형");
				
		byte byteValue = 10;
		// 1byte
		int intValue = byteValue; //자동타입변환 : 오른쪽이 왼쪽보다 작으면 자동으로 변환된다고 생각하자.
		// 4byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		
		float var4 =10.4f;
		System.out.println(var4);
		
				
		int var1 = 10;
		byte var2 = (byte) var1; //큰공간에있는 값을 작은공간으로 옮김. -> 강제타입변환
		System.out.println(var2);
				
		double var3 = 3.1415671321333213213212321321321;
		int var5 = (int) var3;
		System.out.println(var3);
		System.out.println(var5);
				
				
		int eng = 100;
		int kor = 95;
		//double avg = (eng + kor)/2; 
		// 97.5가 나와야하는데 INT형이라서 소수점을 버리고 double로 자동 형 변환이됨.
		double avg = (eng + kor)/2.0;
		//위의 int중 하나를 double로 바꾸거나 나누는값을 소수점으로 만드렁서 계산을해야 값이 정확히 출력된다.
		System.out.println("평균" +  avg);
				
		byte b2 = 127;
		int c2 = 100;
		System.out.println(b2+c2);
		System.out.println((byte)b2+c2); //byte 형으로 강제타입 변환
		System.out.println((int)2.8+1.8); // 2 + 1.8
		System.out.println((int)(2.8+1.8)); //4 
		//괄호를 잘 봐야한다.

		System.out.println("이름과 점수를 입력해주세요");


		Scanner kimsu = new Scanner(System.in); 
		//입력받기위해서는 반드시 Scanner 객체가 필요하다.
		//import java.util.Scanner;로 맨위에 부럴와야지 오류가 안뜬다.
		System.out.println("이름: ");
		String name2 = kimsu.next();
		//이름을 입력하여 변수 name에 scanner객체에 입력한값을 대입한다.
		System.out.println("점수: ");
		int com = kimsu.nextInt();
		// 만약 a,b,c로 나온다면 nextChar();
		System.out.println(name2 + " " + com);
				
		System.out.println("두 점수 입력");
		int a3 = kimsu.nextInt();
		int b3 = kimsu.nextInt();
		
		System.out.println("평균" + " " + (a3 + b3)/2.0);
				
		System.out.println("학점 (A,B,C,F) 입력");		
		//char grade = kimsu.next() // next는 스트링이라서 char 사용 불가
		char grade =kimsu.next().charAt(0); // 입력된 문자열의 하나의 값만 돌려받겠다. 0은 index 0을 의미한다.
				
		System.out.println(grade);
				
		System.out.println(10/4.0);

        String a1 ="김씨";
        String a2 = "김씨";
        String a4 = new String("김씨");
        boolean result = a1.equals(a2);
        boolean result2 = a1.equals(a4);
        System.out.println(result);
        System.out.println(result2);



	}

}
