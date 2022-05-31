package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		Test test2 = new Test();
		Test test3 = new Test();
		
		test.count = 10;
		test2.count = 20;
		test3.count = 30;
		
		test.method();
		test2.method();
		test3.method();
		
		StaticTest staticTest = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		StaticTest staticTest3 = new StaticTest();
		
		staticTest.count = 10;
		staticTest2.count = 20;
		staticTest3.count = 30;
		
		staticTest.count = 100;
		
		staticTest.staticMethod();
		staticTest2.staticMethod();
		staticTest3.staticMethod();
		
		StaticTest.staticMethod();
	}

}
