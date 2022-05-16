package j03_연산;

/*
 * 논리 연산자
 * 
 * AND  => &&	-	곱
 * true && true == true		=> 모든 조건이 참일 때 True의 결과를 가짐.
 * true && false == false	=> 하나라도 거짓이면 False의 결과를 가짐.
 * 
 * OR	=> ||	-	합
 * true || false == true	=> 하나라도 참이면 True의 결과를 가짐.
 * false || false == false 	=> 모든 조건이 거짓일 때 False의 결과를 가짐.
 * 
 * NOT	=> !	-	부정
 * !(true&&true) == false
 * !(false||false) == true
 * 
 * 0 (false)
 * !0 == true
 * 
 */
public class Operation02 {

	public static void main(String[] args) {
		int num = 10;
		boolean result1 = num>5;
		boolean result2 = num == 10;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		System.out.println("result1 AND result2: " + (result1 && result2));
	}

}
