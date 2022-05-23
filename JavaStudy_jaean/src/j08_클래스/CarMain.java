package j08_클래스;

public class CarMain {
	/*
	 * KIA, K7, 블랙(블루)
	 * 현대자동차, 소나타, 화이트(그레이)
	 * 테슬라, 모델3, 레드(그린)
	 */
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "KIA";
		car1.model = "K7";
		car1.color = "블랙";
		
		car1.showInfoAll();
		
		System.out.println(car1.getCar());
		car1.setColor("블루");
		System.out.println("\n[색이 바뀌었습니다.]\n");
		car1.showInfoAll();

		System.out.println("===========================");
		System.out.println();
		
		car2.company = "현대자동차";
		car2.model = "소나타";
		car2.color = "화이트";
		
		car2.showInfoAll();
		
		System.out.println(car2.getCar());
		car2.setColor("그레이");
		System.out.println("\n[색이 바뀌었습니다.]\n");
		car2.showInfoAll();
		System.out.println("===========================");
		System.out.println();
		
		car3.company = "KIA";
		car3.model = "K7";
		car3.color = "블랙";
		
		car3.showInfoAll();
		
		System.out.println(car3.getCar());
		car3.setColor("블루");
		System.out.println("\n[색이 바뀌었습니다.]\n");
		car3.showInfoAll();
	}

}
