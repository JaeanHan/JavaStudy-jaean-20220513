package j20_컬렉션.ArrayList.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		//값 추가 (add)
		nameList.add("김준일");
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("강주현");
		nameList.add("유재원");
		
		//리스트 중간에 값 삽입 (add)
		nameList.add(0, "이동영");
		
		nameList.set(1, "정유진");
		
		//리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		//리스트 내에서 값을 바로 삭제
		nameList.remove("강주현");
		
		//값 확인
		System.out.println(nameList);
		
		//인덱스로 값 가져오기
		System.out.println(nameList.get(2));
		
		System.out.println(nameList.toString());
		
		//리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("김준일"));
		System.out.println(nameList.contains("이동영"));
		
		//리스트 값 옮기기 (깊은 복사)
		nameList2.addAll(nameList);		

		//리스트 내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {
			nameList.clear();
		}
		
		System.out.println(nameList);
		
		System.out.println(nameList2);
		
		Object[] objArray = nameList.toArray();
		
		for(Object obj : objArray) {
			System.out.println((String) obj);
		}
	}
}
