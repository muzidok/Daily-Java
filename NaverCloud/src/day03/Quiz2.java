package day03;

public class Quiz2 {

	public static void main(String[] args) {
	//3. 
	//	int i=0 , sum=0;
	//	while(i <10) {
	//		i = i+2;
	//		sum += i;
	//	}
	//	System.out.println(sum);
		
	//for��
	int sum =0;
	for(int i =0; i<=10; i+=2) {
		sum += i;
	}
	System.out.println(sum);
	
-------------------------------------------------------------------
	// 3-1
	int i =0, sum=0;
	while(true) {
			sum += i;
			i +=2;
			if(i > 10){
				break;
			}
	}
	System.out.println(sum);
	
	//	while(true){
	//	  if(i >=10){
	//	  break;
	//	  }
	//	  i = i+2;
	//	  sum+= i;
	//	  }
	//	  System.out.println(sum);
	
	// 3-2 do-while���� continue�� ����ؼ� �ٲ��
	int i=0, sum =0;
	do {
		sum += i;
		i+=2;
	}while(i <=10);
	System.out.println(sum);
	
	//	do {
	//		i++;
	//		if(i%3 !=0) {
	//			continue; //Ȧ������
	//		}else {
	//			sum += i;
	//		}while(i <10);
	//	}System.out.println(sum);
	
	//continue������
	int sum =0;
	for(int i =0; i <=10; i+=2) {
			sum += i;
			if(i>10) {
			continue;
		}
	}
	System.out.println(sum);

	}

}
