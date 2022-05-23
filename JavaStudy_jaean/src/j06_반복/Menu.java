package j06_반복;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			char select = 0;
			
			printGuide();
			
			select=getInput(sc);
			
			if(select == 'q') {
				break;
				
			} else if (select == '1') {
				System.out.println("java를 선택하셨습니다.");
				
				while(true) {
					printSelect("Java");
					select=getInput(sc);
					
					if(select == 'b') {
						break;
					} else if(select =='1') {
						printDescription("Java");
						
					} else if (select == 'q') {
						loopFlag = false;
						break;
						
					} else {
						printElse();
					}
					System.out.println();
				}
				
			} else if (select == '2') {
				System.out.println("Python를 선택하셨습니다.");
				
				while(true) {
					printSelect("Python");
					
					select=getInput(sc);
					
					if(select == 'b') {
						break;
						
					} else if(select =='1') {
						printDescription("Python");
						
					} else if (select == 'q') {
						loopFlag = false;
						break;
						
					} else {
						printElse();
					}
					
					System.out.println();
				}
				
			} else if (select == '3') {
				while(true) {
					printSelect("Javascript");
					
					select=getInput(sc);
					
					if(select == 'b') {
						break;
						
					} else if(select =='1') {
						printDescription("Javascript");
						
					} else if (select == 'q') {
						loopFlag = false;
						break;
						
					}else {
						printElse();
					}
					
					System.out.println();
				}
			} else {
				printElse();
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
	
	public static void printGuide() {
		System.out.println("[메뉴 선택]");
		System.out.println("1. java");
		System.out.println("2. python");
		System.out.println("3. javascript");
		System.out.println("q. 프로그램 종료");
	}
	
	public static void printSelect(String obj) {
		System.out.println("[ "+obj + " 메뉴 ]");
		System.out.println("1." + obj +"란?");
		System.out.println("b. 뒤로가기");
		System.out.println("[q. 프로그램 종료]");
	}
	
	public static void printDescription(String obj) {
		System.out.println(obj+ "란 . . . 입니다.");
		System.out.println("계속 하시려면 엔터를 눌러주세요. . .");
	}
	
	public static void printElse() {
		System.out.println("해당 명령은 보기에 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	public static char getInput(Scanner sc) {
		System.out.print("명령을 입력하세요: ");
		char select = sc.next().charAt(0);
		sc.nextLine();
		return select;
	}

}
