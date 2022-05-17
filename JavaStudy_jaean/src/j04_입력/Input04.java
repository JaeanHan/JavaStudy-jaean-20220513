package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String 개요 = null;
		String 감독 = null;
		String 등급 = null;
		String 흥행 = null;
		String 줄거리1 = null;
		String 줄거리2 = null;
		
		System.out.print("개요를 입력해주세요: ");
		개요 = sc.nextLine();
		
		System.out.print("감독을 입력해주세요: ");
		감독 = sc.nextLine();
		
		System.out.print("등급을 입력해 주세요: ");
		등급 = sc.nextLine();
		
		System.out.println("흥행을 입력해주세요: ");
		흥행 = sc.nextLine();
		
		System.out.println("줄거리를 입력해주세요: ");
		줄거리1 = sc.nextLine();
		줄거리2 = sc.nextLine();
		
		System.out.println(개요);
		System.out.println(감독);
		System.out.println(등급);
		System.out.println(흥행);
		System.out.println(줄거리1);
		System.out.println(줄거리2);
	}

}
