package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		System.out.println(t1.toString());
		System.out.println(t2);  // toString hidden
		System.out.println(t1 == t2); // address comparison
		System.out.println(t1.equals(t2)); //equals override
		System.out.println(t1.hashCode() == t2.hashCode()); // hashcode comparison
		
	}
}


