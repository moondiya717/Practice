package April30.Practice;

import java.util.Scanner;

public class day4_for_test4 {

	public static void main(String[] args) {
		/** 정수를 랜덤으로 생성하여 생성된 숫자를 맞추는 게임
		 * Math.random() 은 0보다 크거나 같고 1보다 작은 임의의 실수를 생성하는 기능 
		 * int r=(int)(Math.random()*(max-min+1)+min);**/

		
		// 랜덤으로 수를 만들기 + 수의 범위 값을 min1, max100주기
		
		int i, min=1, max=100;
		int r=(int)(Math.random()*(max-min+1)+min);
		Scanner scan = new Scanner(System.in);
		
		System.out.print(r); //내가 숫자 확인할 용도로 노출해놓은거임. 
		
		// 반복문으로 : 수입력하라는 메세지 출력-> 입력받기 -> 대답해주기
		for(i=1; i<=100 ; i+=1 ) {
			System.out.print("정수를 입력하세요("+ min+ "~"+max+"): ");
			int num=scan.nextInt();
			if(num<r) {
				System.out.println("up");
			}else if(num>r) {
				System.out.println("down");
			}else {
				System.out.println("정답!");
				break;
			}
		}
		
		
		
		
		
		
	}

}
