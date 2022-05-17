package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열2 입력: nextLine()		hi
		 * 문자열1 입력: next()			안녕
		 * 문자 입력: next().charAt(0)	A
		 * 정수입력: nextInt()			10
		 * 실수 입력: nextDouble()		3.14
		 */
		
		Scanner sc = new Scanner(System.in);
		String s1 = null;
		String s2 = null;
		char s3 = 0;
		int i1 = 0;
		double d1 = 0;
		
		System.out.print("문자열1 입력: ");
		s1 = sc.nextLine();
		System.out.println("입력된 문자열1: " + s1);

		System.out.println("문자열2 입력: ");
		s2 = sc.next();
		System.out.println("입력된 문자열2: " + s2);
		
		System.out.println("문자 입력");
		s3 = sc.next().charAt(0);
		System.out.println("입력된 문자: " + s3);
		
		System.out.println("정수 입력");
		i1 = sc.nextInt();
		System.out.println("입력된 정수: " + i1);
		
		System.out.println("실수 입력");
		d1 = sc.nextDouble();
		System.out.println("입력된 실수: " + d1);
			
		
	}

}
