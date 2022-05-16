package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * result = 결과
		 * 
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * 윤년이면 true 아니면 false
		 * 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 * 
		 */
		int year = 1999; // 메모리 할당 (선언) == 변수 만드는거
		boolean result = (year%4 == 0); //메모리 할당 (선언)
		
		year = 2000; //위에서 한번 "선언"한거는 계속 쓸 수 있어요 프로그램 종료될 때 까지
		
		result = (year%4==0 && year%100 != 0) || (year%4==0 && year%400 == 0);
		
		System.out.println(result);
	}

}
