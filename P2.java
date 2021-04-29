package April29;

public class P2 {

	public static void main(String[] args) {


		/* 하나의 *를 이용하여 다음과 같이 출력되도록 작성하세요.
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		
		int i, j;
		char a = '*';

		
		for(j=1; j<=5 ;j+=1 ) {
			for(i=1; i<=5; i+=1) {
				System.out.print(a);
			}System.out.println("");
		}
	
		
		
		/* 구구단 전체를 출력하는 코드를 작성하세요.  */
		
		int k, h;
		
		for(k=2; k<=9; k+=1) {
			for(h=1;h<=9;h+=1) {
				System.out.println(k + "*" + h + "=" + (k*h));
			}
		}
		
		
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수 : 약수가 2개인 수
		 * 소수 : 2 3 5 7 11 13 17 ...
		 * 4 : 1 2 4 */
		
		int num=17, w;
		for(w=1; w<=num; w+=1) {
			if(num%1==0 && num%num==0) {
				System.out.println(num + "은(는) 소수입니다.");
			}else {
				System.out.println(num + "은(는) 소수가 아닙니다.");
			}break;
		}
			
		
		
		
	}
}

