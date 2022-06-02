package j18_최상위클래스;

import java.util.Objects;

/*
 * Object (최상위 클래스)
 * 
 *  native -> jni 자바 네이티브 인터페이스
 * 
 */

public class Teacher {
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
//		return super.toString();
//		return "이름: " + name + ", 과목: " + subject;
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		System.out.println(this.getClass().getSimpleName());
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj;
//			
//			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
}
