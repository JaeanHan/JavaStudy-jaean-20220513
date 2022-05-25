package j09_접근지정자.b;

public class Teacher {
	private String name;
	private String address;
	private String phone;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	private String createMessage(String name, String value) {
		return name + "님의 " + value;
	}
	
	public void showInfo() {
		System.out.println(createMessage(name, address));
		System.out.println(createMessage(name, phone));
	
	}
}
