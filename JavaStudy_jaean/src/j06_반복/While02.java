package j06_반복;

public class While02 {

	public static void main(String[] args) {
		//구구단 2단 출력
		
		int dan = 2;
		int num = 0;
		
		int i=0;
		
		while(i<dan) {
			while(num<9) {
				System.out.println((i+1) + " X " + (num+1) + " = "+ (i+1)*(num+1));
				num++;
			}
			num=0;
			System.out.println();
			i++;
		}
	}
}
