package j23_예외처리;

public class Throws01 {
	public void printArray(int[] array) throws Exception {
		
		for(int i=0; i<array.length +1;i++) {
			System.out.println("index" + i + ": " + array[i]);
		}
	}
}
