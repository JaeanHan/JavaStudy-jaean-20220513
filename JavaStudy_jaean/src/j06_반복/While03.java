package j06_반복;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		int num = 0;
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복 횟수를 입력하세요: ");
		
		num = sc.nextInt();
		
		while(i<num) {
			System.out.println(++i);
		}
		
		i=0;
		
		while(i<num) {
			System.out.println(num-i);
			i++;
		}
	}
	
}
