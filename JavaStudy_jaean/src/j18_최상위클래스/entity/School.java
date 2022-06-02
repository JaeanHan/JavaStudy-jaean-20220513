package j18_최상위클래스.entity;

import java.util.Objects;

public class School {
	private String schoolName;
	private String schoolClassification;
	private String location;
	private String schoolAddress;
	private String schoolEvaluation;
	private int numberStudents;
	private int numberTeachers;
	
	public School() {
		// TODO Auto-generated constructor stub 
	}

	public School(String schoolName, String schoolClassification, String location, String schoolAddress,
			String schoolEvaluation, int numberStudents, int numberTeachers) {
		this.schoolName = schoolName;
		this.schoolClassification = schoolClassification;
		this.location = location;
		this.schoolAddress = schoolAddress;
		this.schoolEvaluation = schoolEvaluation;
		this.numberStudents = numberStudents;
		this.numberTeachers = numberTeachers;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolClassification() {
		return schoolClassification;
	}

	public void setSchoolClassification(String schoolClassification) {
		this.schoolClassification = schoolClassification;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolEvaluation() {
		return schoolEvaluation;
	}

	public void setSchoolEvaluation(String schoolEvaluation) {
		this.schoolEvaluation = schoolEvaluation;
	}

	public int getNumberStudents() {
		return numberStudents;
	}

	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}

	public int getNumberTeachers() {
		return numberTeachers;
	}

	public void setNumberTeachers(int numberTeachers) {
		this.numberTeachers = numberTeachers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, numberStudents, numberTeachers, schoolAddress, schoolClassification,
				schoolEvaluation, schoolName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(location, other.location) && numberStudents == other.numberStudents
				&& numberTeachers == other.numberTeachers && Objects.equals(schoolAddress, other.schoolAddress)
				&& Objects.equals(schoolClassification, other.schoolClassification)
				&& Objects.equals(schoolEvaluation, other.schoolEvaluation)
				&& Objects.equals(schoolName, other.schoolName);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolClassification=" + schoolClassification + ", location="
				+ location + ", schoolAddress=" + schoolAddress + ", schoolEvaluation=" + schoolEvaluation
				+ ", numberStudents=" + numberStudents + ", numberTeachers=" + numberTeachers + "]";
	}
	
	
}
