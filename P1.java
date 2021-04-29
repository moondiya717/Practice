package April29;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		/* for문 - 1부터 10까지의 짝수들의 합을 구하는 예제
		 * */

		int i, sum=0;
		for(i=2;i<=10;i+=2) {   
			sum+=i;
		}
			System.out.println("1부터 10까지 짝수 합 :"+ sum);
		
		
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			
		/** 1부터 5까지 출력하는 예제를 작성하세요.**/			
			
		int j, sum1=0;
		for(j=1; j<=5; j+=1) {
			sum1+=j;
			System.out.print(j + " ");}

System.out.println();
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		/* 1부터 10까지의 짝수들만 출력하는 코드를 작성하세요. */

		int k;
		for(k=1; k<=10; k+=1) {
			if(k%2==0) {
				System.out.print(k+ " ");
			}
	
		}

System.out.println();
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		 /** 정수의 약수를 출력하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 6
		 * 1 2 3 6
		 **/

		int l, m=6;
		for(l=1; l<=m; l+=1) {
			if(m%l==0) {
				System.out.print(l+" ");
			}
		}

		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		/* 8과 12의 최대 공약수를 구하는 코드를 작성하세요. */
		//★틀★렸★다★ -  gcd중간에 끼는거 잊음
		
		
		int p, n=8, o=12, gcd=1;
		for(p=1; p<=n&&p<=o; p+=1) { 
			if(n%p==0&&o%p==0) {
				gcd=p;
			}	
		}		System.out.print(gcd);	
		
		
System.out.println();
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");		
		
		
 		/** a부터 z까지 출력하는 코드를 작성하세요. **/
		// ★틀★렸★다★ - 출력문에 ('a'+q)에다가 괄호만 안썼는데 숫자나와
		int q=(char)'a';
		for(q=0; q<26; q+=1) {
			System.out.print((char)('a'+q) +" ");
		}
		
		
System.out.println();
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");		
		
		
		/*콘솔에서 r이나 R을 입력받을 때 까지 반복하는 예제*/
		//☆scan.next 를 알파벳입력하세요 뒤에쓰는게 중요함☆

		Scanner scan = new Scanner(System.in);
		char op='a'; 
		

		for( ; op!='r'&&op!='R' ; ) {
			System.out.print("알파벳을 입력하세요: ");
			op=scan.next().charAt(0);
			{
				
			}
		} 			
		
System.out.println();
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");				
		

		/**8과 12의 최소 공배수를 구하는 코드를 작성하세요.**/
		// 코드는 맞았는데, 변수선언할때 num1,2가 아니라 알파벳 df로하면 답 틀림.ㅡㅡ
		//알파벳으로 하면 다안돼ㅠㅠ 왜이래

		int c,num1=8,num2=12;
		for(c=1; c<=num1*num2; c+=1) {
			if(c%num1==0 && c%num2==0) {
				System.out.println(c);
				break;
			}			
		}
		
		
		
		
		
		
		
	}

}
