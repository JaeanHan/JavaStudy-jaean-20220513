package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.ArrayList.entity.Student;

public class HashSetEx2 {
	public static void main(String[] args) {
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교"
		 * 
		 * studentCode가 20220002의 학생을 조회
		 * 
		 * 20220001의코드를 가진 학생을 삭제
		 */
		HashSet<Student> hs = new HashSet<>();
		
		int studentCode = 20220000;
		String[] names = {"김준일", "김준이"};
		String[] schoolName = {"부산대학교", "부경대학교"};
		
		for(int i=0; i<names.length; i++) {
			hs.add(new Student(++studentCode, names[i], schoolName[i]));
		}
		
		System.out.println(hs);
		System.out.println();
		
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getStudentCode() == 20220001) {
				System.out.println("조회: " + student);
			}
		}
		
		it = hs.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getStudentCode() == 20220001) {
				hs.remove(student);
			}
		}
		
		System.out.println();
		System.out.println(hs);
	}
}
