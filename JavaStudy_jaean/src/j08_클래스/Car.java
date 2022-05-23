package j08_클래스;

public class Car {
	/*
	 * 1. Car 클래스를 만든다.
	 * 2. Car 클래스의 속성(변수) 제조사(company), 모델(model), color(색상)
	 * 3. Car 클래스의 기능(메소드)
	 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
	 * showInfoAll() ->
	 * 제조사: 00
	 * 모델: 00
	 * 색상: 화이트
	 * getCar() -> return 제조사_모델_색상
	 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경 
	 */
	
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 차량입니다.");
	}
	
	void showInfoAll() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	
	String getCar() {
		return company + "_" + model + "_" + color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}
