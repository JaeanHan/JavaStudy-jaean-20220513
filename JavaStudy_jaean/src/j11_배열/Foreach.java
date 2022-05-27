package j11_배열;

public class Foreach {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		for(int num : numbers) {
			sb.append(num + ", ");
			System.out.print(num + (i != numbers.length-1 ? ", " : "\n"));
			i++;
		}
		
		sb.deleteCharAt(sb.length()-1); // 스페이스바
		sb.deleteCharAt(sb.length()-1); // 콤마
		
		System.out.println("string builder: " + sb);
	}
}
