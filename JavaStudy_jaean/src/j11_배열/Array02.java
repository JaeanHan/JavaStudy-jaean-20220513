package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size];
//		
//		System.out.println(numbers.length);
		
		/*
		 * for문으로 0 ~ 99까지 반복을 한다.
		 * 변수 i의 값이 8의 배수이면 
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오.
		 */
		
		int cnt = 0;
		
		for(int i=0; i<100; i++) {
			if(i != 0 && i % 8 == 0 ) {
				cnt++;
			}
		}
		
		int[] intArray = new int[cnt];
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (i+1)*8;
		}
		
		for(int value : intArray) {
			System.out.println("값: " + value);
		}
		
		System.out.println("-----------------------");
		
		int[] numbers2 = new int[1];
		
		for(int i=0; i<100; i++) {
			if(i!=0 && i%8==0) {
				int[] tempNum = new int[numbers2.length+1];
			
				for(int j=0;j<numbers2.length; j++) { // deep copy O(n^2)?
					tempNum[j] = numbers2[j];
				}	
				
				tempNum[tempNum.length-1] = i;
				
				numbers2 = tempNum;
				System.out.println("numbers2: " + numbers2[tempNum.length-1]);
			}
			
		}
		
		for(int i : numbers2) {
			System.out.println("check : " + i);
		}
	}

}
