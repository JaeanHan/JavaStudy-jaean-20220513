package j01_첫수업;

public class HelloJava {
	/*
	 * 웹 통신은 바이트 단위 -> 8비트?
	 * 자료형 크기 (바이트)
	 * 
	 * char 2byte text *
	 * 
	 * shot 2byte numeric
	 * 
	 * int 4byte numeric *
	 * 
	 * long 4byte numeric
	 * 		Long num = 1234567890L;
	 * 
	 * double 8byte numeric *
	 * 		Double num2 = 0.2F;
	 * float 4byte numeric
	 * 		Float num3 = 0.1F;
	 * 
	 * 실수자료형은 소수점 전후로 저장되는 데이터의 영역이 달라서 메모리가 큼 (int가 두개)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int age = 29; // 선언 및 초깃 값 대입
		age = 10; // 값 대입
		
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1;
		System.out.println(age);
	}
}
