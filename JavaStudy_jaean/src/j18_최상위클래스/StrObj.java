package j18_최상위클래스;

import java.util.Scanner;

public class StrObj {

	public static void main(String[] args) {
		String name = "김준일";
		String name2 = "김준일";
		
		System.out.println(name == name2); //리터럴 주소값 비교

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine();
		
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2); //name 주소값 비교
		
		System.out.println(name.equals(name2));
		
		
	}

}
