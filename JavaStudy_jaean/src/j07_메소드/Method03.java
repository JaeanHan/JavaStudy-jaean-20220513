package j07_메소드;

//메소드 오버로딩

public class Method03 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void test1(double a) {
		System.out.println("double 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int 자료형 다음에 double 자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double dNum, int num2) {
		System.out.println("double 자료형 다음에 int 자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void main(String[] args) {
		test1();
		test1(5);
		test1(10,20);
		test1(10, 3.3);
	}

}
