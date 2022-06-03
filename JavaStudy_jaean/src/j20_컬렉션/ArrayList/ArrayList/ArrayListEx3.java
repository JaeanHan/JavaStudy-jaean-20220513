package j20_컬렉션.ArrayList.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.ArrayList.entity.Student;

public class ArrayListEx3 {
/*
 * 1. Student 자료형을 담을 수 있는 ArrayList를 생성.
 * 
 * 2. 학생정보 추가
 * 	studentCode	name	schoolName
 *  20220001	김준일	부산교육대학원
 *  20220002	곽나경	부산대학교
 *  20220003	정현경 	부경대학교
 *  20220004	한재안	부산대학교
 *  20220005	전주홍	동아대학교	
 *  
 *  3. 전체 학생 정보 출력
 *  
 *  4. 인덱스 3의 위치에 삽입
 *  20220006	한대경	서울대학교
 *  
 *  5. 인덱스 2위치에 있는 학생의 학교명을 고려대학교
 *  
 *  6. 5의 위치에 있는 학생의 정보를 수정
 *  20220007	김나예	부산여자중학교
 *  
 *  7. 인덱스 0위치에 있는 학생의 정보를 삭제
 *  
 */
	
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		int studentCode = 2022000;
		
		String[] names = {"김준일", "곽나경", "정현경", "한재안", "전주홍"};
		String[] schoolNames = {"부산교육대학원", "부산대학교", "부경대학교", "부산대학교", "동아대학교"};
		
		for(int i=0; i<names.length; i++) {
			studentList.add(new Student(++studentCode, names[i], schoolNames[i]));
		}

		System.out.println(studentList.toString());
		
		studentList.add(0, new Student(++studentCode, "한대경", "서울대학교"));
		
		studentList.get(2).setSchoolName("고려대학교");
		
		studentList.set(5, new Student(++studentCode, "김나예", "부산여자중학교"));
		
		studentList.remove(0);
		
		System.out.println("check: " + studentList);
		
	}
}
