package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<>();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
		
		System.out.println(name.toString());
		
		Iterator<String> it = name.iterator();
		
		while(it.hasNext()) {
			String name2 = it.next();
			if(name2.equals("김준이"))
			System.out.println(name2);
		}
		
		name.remove("김준사");
		
		
	}

}
