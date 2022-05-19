package j06_반복;

public class For02 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<j+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(3-i<j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if(5+i < j || 5-i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<11; j++) {
				if(5+i < j || 5-i > j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<9; i++) {
			i+=2;
			System.out.println(i + "단");
			for(int j=0; j<9; j++) {
				System.out.println(i + " X " + (j+1) + " = " + (i)*(j+1));
			}
			System.out.println();
			i-=2;			
		}
		
	}

}
