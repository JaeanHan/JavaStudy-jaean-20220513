package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		int year = 1999;
		
		/*
		 * 4의 배수 이면서 100의 배수가 아니거나 400의 배수인 경우 윤년
		 * 
		 */
		String result = (year%4==0 ? year%400==0 ? "윤년" : "윤년이 아님" : "윤년이 아님");
		//					조건1		조건1이 참일 때(실행)  					조건1이 거짓일 때(실행)
		//									조건2
		//										조건2가 참 : 거짓

		System.out.println("결과: " + result);
	}
}
