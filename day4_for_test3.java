package April30.Practice;

public class day4_for_test3 {

	public static void main(String[] args) {
		 /* 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 1234
		 * 결과 : 4321
		 */

		
		int i, j, num=1234;
		
		for(i=1; i<=num; i+=1) {
			for( ; ; ) {
				System.out.print(num % 10);
				num=num/10;
				if(num==0) {
					break;
					
				}
			}			
		}
		
		
		
		
		
	}

}
