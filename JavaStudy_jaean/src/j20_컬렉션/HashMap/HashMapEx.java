package j20_컬렉션.HashMap;

import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String> studentMap = new java.util.HashMap<Integer, String>();
		
		//값 추가
		studentMap.put(1, "김준일");
		studentMap.put(2, "김준이");
		studentMap.put(3, "김준삼");
		studentMap.put(4, "김준사");
		studentMap.put(5, "김준오");
		
		System.out.println(studentMap);
		
		//key값으로 value 가져오기
		System.out.println(studentMap.get(0));
			
		studentMap.put(10, "김준육"); // merge
		studentMap.replace(10, "김준칠"); // update
		
		studentMap.remove(10);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);		
//			if(value.equals("김준오")) {
//				System.out.println(value);
//			}
			System.out.println(value);
		}
		
		//lambda 함수형 프로그래밍
		studentMap.forEach((k,v) -> {			
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		System.out.println(studentMap.containsKey(2));
		System.out.println(studentMap.containsValue("김준구"));
	}
}
