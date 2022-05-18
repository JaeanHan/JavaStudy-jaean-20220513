package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=0;
		int no1 = 1000;
		int no2 = -1000;
		System.out.println("점의 x y좌표를 띄어쓰기로 구분해 입력해주세요.");
		x = sc.nextInt();
		y = sc.nextInt();
		
//		if (x==0&&y==0) System.out.println("원점입니다.");
//		if ((x==0&&y!=0) || (y==0&&x!=0) || x < -1000 || y < -1000 || x > 1000 || y > 1000 ) {
//			System.out.println("계산할 수 없습니다.");
//		} else if (x==0&&y==0) {
//			System.out.println("원점입니다.");
//		} else if (x>0 && y>0) {
//			System.out.println("1사분면 입니다.");
//		} else if (x>0 && y<0) {
//			System.out.println("4사분면 입니다.");
//		} else if (x<0 && y>0) {
//			System.out.println("2사분면 입니다.");
//		} else {
//			System.out.println("3사분면 입니다.");
//		}
		
		if(x==0 && y==0) {
			System.out.println("원점입니다.");
		} else if (x==0 || y==0 || x < -1000 || x > 1000 || y < -1000 || y > 1000) {
			System.out.println("계산할 수 없습니다.");
		} else {
			System.out.println(x>0 ? (y>0 ? "1사분면 입니다" : "4사분면 입니다") : y<0 ? "2사분면 입니다" : "3사분면 입니다.");
		}
		
		System.out.println(
			(x > 1000 || y > 1000 || x <-1000 || y<-1000 || x==0 || y==0)
				&&(x != 0 || y != 0) ? "계산불가"
						: x>0 && y>0 ? "1사분면"
								: x>0 && y<0 ? "4사분면"
										: x<0 && y>0 ? "2사분면"
												: x<0 && y<0 ? "3사분면"
														: "원점"
		);
	}

}
