package j11_배열;

public class Array01 {

	public static void main(String[] args) {
		//1. 배열의 공간(크기)을 정해서 생성 
		int[] numbers = new int[10];
		
		//2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, false, true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";
		
		for(int i=0; i< (numbers.length > numbers2.length ? numbers2.length : numbers.length); i++) {
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2:" + numbers2[i]);
		}
	
		for(int i=0; i< strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	
	}

}
