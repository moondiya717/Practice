package April30.Practice;

public class day5_star1 {

	public static void main(String[] args) {
		/* 아래와 같이 별*을 다섯개씩 한 개로 다섯줄을 만드세요.
		 * 
		 * ***** 	
		 * ***** 	
		 * ***** 	
		 * ***** 	
		 * ***** 	
		 * 
		 */
		
		
		int i, j;
			
		for(i=1;i<=5;i+=1) { 					// 다섯번 반복 =>다섯줄짜리 라인만듬
			for(j=1; j<=5; j+=1) {				// * 다섯개짜리 만듬
				System.out.print('*');
			} System.out.println();
		}
		
System.out.println();		
		
		/* 
		 * * 			 
		 * **			
		 * *** 			
		 * **** 	
		 * ***** 		
		 */
		
			
	

	for(i=1; i<=5; i+=1) {  			// i로 다섯줄
		for(j=1; j<=i; j+=1) { 			// j로 별만들기 ( 1 2 3 4 5)  
			System.out.print('*');		/**	*을 1개씩 늘리면서 출력하는 걸 j<=i로 범위설정해야 함 **/
		}System.out.println();			/** 조건식에서 j가 i의 범위만큼 반복해서 *을 찍어야하니깐 줄 늘어나는 수만큼 추가되는거임. **/
	} 
		

System.out.println();

		
		
	/* 별 앞에공백 4칸 넣기
	 *     **** 	공백4	*=4개  
	 *     **** 	공백4	*=4개
	 *     **** 	공백4	*=4개
	 *     **** 	공백4	*=4개
	 *     **** 	공백4	*=4개
	 */
		
	
	for(i=1; i<=5; i+=1) {  //다섯줄 만들기
		for(j=1; j<=4; j+=1) { //별만들기
			System.out.print("    ");
			for(j=1; j<=4; j+=1) {
				System.out.print('*');
			}			
		}System.out.println();
	}


System.out.println();
	
	
	   /*     *		
		*    **		
		*   ***		
		*  ****	
		* *****		
		* 						
		* 	 */


	for(i=1; i<=5; i+=1) {  				//다섯줄 만들기 (i값 증가=> 1 2 3 4 5) 
		for(j=1; j<=5-i; j+=1) {				// 공백이 4 3 2 1 0
			System.out.print(" ");
		}
		for(j=1; j<=i; j+=1) { 			// 별이 1 2 3 4 5   /**for문이 for>for>for 가 아니라 for> for(1), for(2)**/
				System.out.print('*');
			}System.out.println();
		}
	








	}

}
