package j08_클래스;

public class FishBunMain {
//참조자료형
	
	public static void main(String[] args) {
		FishBun fishBun = new FishBun(); //객체 생성 (메모리 영역에 할당: 실질적으로 저장됨) Heap 영역
		
		fishBun.showInfo();
		
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		
		fishBun.showInfo();
		
		System.out.println("======================================");
		
		FishBun fishBun2 = new FishBun(); //객체 생성 (메모리 영역에 할당: 실질적으로 저장됨) Heap 영역
		
		fishBun2.showInfo();
		
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		
		fishBun2.showInfo();
		
		System.out.println("-------------------------------------");
		
		fishBun.showInfo();
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
		
	}

}
