package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class principalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		
		GrantedAuthority grantedAuthority = new GrantedAuthority() { //익명 클래스
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println("anonymous1!");
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println("anonymous2!");
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> System.out.println(r));
		grantedAuthority2.getRoles(strList).forEach(r -> System.out.println(r));
		grantedAuthority3.getRoles(strList).forEach(r -> System.out.println(r));
	}

}
