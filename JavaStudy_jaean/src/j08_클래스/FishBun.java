package j08_클래스;

public class FishBun { //Stack 영역
	String material; //재료
	String dough; //도우
	
	FishBun() { //생성자
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println(("반죽:" + dough));
	}
}
