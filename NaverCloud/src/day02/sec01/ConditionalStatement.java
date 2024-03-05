package day02.sec01;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a = 5, b;
		
	//	++a, a++ 같이 단독으로 사용하는경우에는 값이같다. 근데 대입연산자가 들어가면 차이점이 보인다.
	b = a++; // b에 대입 후 a의 값을 1을 증가
	System.out.println(b); // 대입되고 바로 출력해서 5가 출력됨
	System.out.println(a); // 대입되고 증가되어서 6
	
	b = ++a; // a의 값을 증가시키고 b에 대입 
	System.out.println(b); // 증가시키고 대입하여서 7
	System.out.println(a); // 증가시키고 대입되어서 똑같이7

	
	System.out.println('a' > 'b');//비교연산자는 결과값이 boolean이다.
	System.out.println((2>3) &&  (3==3)); // 둘다 옳아야지 참이된다. false
	System.out.println((2>3) ||  (3==3)); //하나만 옳아도 참이된다. true
	
	int score = 85; // 변수선언 동시에 초기화
	if(score >= 90) { // 거짓이라서 실행이되지않고 else문으로 넘어간다.
		System.out.println("정수가 90보다 큽니다"); 
		System.out.println("등급은 A입니다");
	}else { // else는 if의 반대이기때문에 여기에 조건을 걸면 에러가 난다.
		System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");
	}
	
	int a1=10,b1=5;
	if(a1 == 10) { //참이기때문에 밑부분 조건을 확인함
		System.out.println("A");
	}else if (a1<b1) { // a != 10 && a <b
		System.out.println("B");
	}else if(a1>b1) { // a != 10 && a>b
		System.out.println("C");
	}
	
	/*
	Scanner sc = new Scanner(System.in); // 표준 입력 스트림		
	System.out.println("점수를 입력해주세요");
	int kor = sc.nextInt(); // 정수를 입력해서 변수 kor에 저장
	
	char grade;	
	if(kor >= 90) { //입력한 정수가 90보다 큰경우 조건확인
		grade ='A';
	}else if (kor >= 80) {
		grade ='B';
	}else if(kor >= 70) {
		grade ='C';
	}else 	
	grade ='F';
	// 삼항연산자 사용
	char grade = (kor >= 90) ? 'A' : (kor >= 80) ? 'B' : (kor >= 70) ? 'C' : 'F';
	System.out.println("학점" + grade);
	*/
	
	
	int total =300;
	double avg = total/3.0;
	double avg2 = total/3; // int  / int 는 몫만 나타난다.
	System.out.println(avg);
	System.out.println(avg2);
	
	if(avg >= 90) {
		System.out.println("A");
	}else if(80 <= avg && avg < 90) {//논리연산자(논리곱)
		System.out.println("B");
	}
	
	// 중첩if문
	int a2 = 20, b2 = 10;
	// 중첩if문은 바깥if문이 참이어야 안쪽 if문을 확인가능하다.
	if(a2<10) {
		if(b2>=0) { // 조건인 true일경우 5  1
			b2 =1;
		}else { // b가 0보다 작다면 실행
			b2 = -1;
		}
	}// 조건이 거짓이라 아예 안쪽 if문을 다 스킵해버림
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
	System.out.println("점수입력");
	int score = sc.nextInt();
		
	System.out.println("학년 입력");
	int grade = sc.nextInt();
	
	if(score >= 60) {
	if(grade != 4) {
		System.out.println("합격");
	}else if(score >= 70) {
		System.out.println("합격");
	}
	}else {
	System.out.println("불합격");
	}
	 */
	
	// switch 문
	// 변수값에 따라서 실행문이 결정된다.
	int num = (int) (Math.random()*10) + 1;
	
	switch (num) {
		case 1: 
		case 10: //int num이 1이거나 10이라면
			System.out.println("1번");
		case 2: 
			System.out.println("2번");
		case 3: 
			System.out.println("3번");
		case 4: 
			System.out.println("4번");
			break;
		default : // if-else문의 else와 같은 역할을 한다.
			System.out.println("5번");
			
	// 자바 12 버전이후부터는 표현식 사용이 가능해졌다.
	//case 1, 10 -> {};
	}
	}

}
