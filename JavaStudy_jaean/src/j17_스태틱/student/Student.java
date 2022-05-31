package j17_스태틱.student;

public class Student {
/*
 * student_code(정수)
 * student_name(이름)
 * student_year(학년)
 * 
 * 학생을 항명 생성할 때마다 자동으로 student_code의 값이 1씩 증가하여
 * 부여될 수 있게 작성.
 * 20220001
 * 20220002
 * 
 */
	private static int auto_increment = 20220000;
	private int studentCode;
	private String studentName;
	private int studentYear;
	
//	private Student() {
//	
//	}
	
//	private int makeStudentCode(int code) {
////		배열.length + 1 ?
//		return 20220000 + code;
//	}
	
	public Student(String studentName, int studentYear) {
		this.studentCode = ++auto_increment ;
		this.studentName = studentName;
		this.studentYear = studentYear;
	}
	
	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public void showInfo() {
		System.out.println("학번: " + studentCode);
		System.out.println("이름: " + studentName);
		System.out.println("학년: " + studentYear + "\n");
	}
}
