package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 김준일							문자열	name
		 * 나이 : 29							정수	age
		 * 연락처: 010-9988-1916				문자열	phone
		 * 주소: 부산 동래구 사직동				문자열	address
		 * 성별: 남								문자	gender
		 * 
		 * [개인정보 출력]
		 * 이름 =>
		 * 나이 =>
		 * 연락처 =>
		 * 주소 =>
		 * 성별 =>
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String phone;
		String address;
		char gender;
		
		System.out.println("[개인정보 입력]");
		
		System.out.print("이름: ");
		name = sc.nextLine();
		
		System.out.print("나이: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연락처: ");
		phone = sc.nextLine();
		
		System.out.println("주소: ");
		address = sc.nextLine();
		
		System.out.println("성별: ");
		gender = sc.nextLine().charAt(0);
		
		System.out.println("[개인정보 출력]");
		
		System.out.println("이름 => " + name + "\n"
				+ "나이 => " + age + "\n"
				+ "연락처 => " + phone + "\n"
				+ "주소 => " + address + "\n"
				+ "성별 => " + gender + "\n");
	}
	
}
