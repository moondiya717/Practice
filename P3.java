package April29;

public class P3 {

	public static void main(String[] args) {
		/* 100이하의 모든 소수를 출력하는 코드를 작성하세요. */
		//for이중지문인거 모르면 못풀겠당
		
		int num, i, cnt=0;
		
		for(num=1; num<=100; num+=1) {
			for(i=1, cnt=0; i<=num; i+=1) {
			if(num % i ==0&& num % num ==0) {
				cnt+=1;
			}		
		}
		if(cnt==2) {
			System.out.print(num+ " ");
		}
			
		

		
		
	}
	}
	}
