package April30.Practice;

public class day4_for_test1 {

	public static void main(String[] args) {
		
		
		// 11부터 20까지 출력하는 코드를 작성하세요.

		int i;
		for(i=11; i<=20; i+=1) {
			System.out.print(i+" ");
		}
		
System.out.println();

		/**20부터 11까지 출력하는 코드를 작성하세요 **/

		for(i=20; i>=11; i-=1) {
			System.out.print(i+ " ");
		}

System.out.println();
		
		/* 1부터 100까지 숫자 중 일의 자리가 3, 6, 9로 끝나는 수들을 출력하는 코드를 작성하세요. */
		
	// 1-100까지 수를 확인해야 함 -> for1~100
	// 3, 6, 9로 끝나는 숫자들을 걸러내기 
	// 걸러낸 숫자들을 저장하고 출력하기 => 출력을 저장하고나서 바로 if실행문에서 써서 해야 돼. 안그러면 마지막 값만 나옴.

		int gcd=0;
		for(i=1; i<=100; i+=1) {
			if(i%3==0 || i%6==0 || i%9==0) {
				gcd=i;
				System.out.print(gcd + " ");
			}
		} 

		

		
		
		
		

	}

}
