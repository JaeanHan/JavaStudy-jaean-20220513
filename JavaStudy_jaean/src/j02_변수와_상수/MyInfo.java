package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 *
		 * 1.문제
		 * name1, name2, name3
		 * age 나이
		 * phone 연락처
		 * address 주소
		 * 
		 */
		
		char name = '한';
		char name2 = '재';
		char name3 = '안';
		
		int age=24;
		String phone = "01000001111";
		String address = "용인시 수지구";
		System.out.print("이름 : ");
		System.out.print(name);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("연락처 : ");
		System.out.println(phone);
		System.out.print("주소 : ");
		System.out.println(address);
		
		System.out.print("이름: ");
		System.out.println(""+ name + name2 + name3);
		
		System.out.println();
	}

}
