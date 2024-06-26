package com.javaex.practice;
import java.util.Scanner;
/*다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
⚫ 세금계산법
⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)*/
public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수익을 입력해 주세요\n금액 : ");
		double n = sc.nextDouble();
	
		if ( n <= 0 ){
			System.out.println("잘못 입력했습니다.");
		} else if ( n < 1000 ) {
			System.out.println("소득세는 " + n*(0.09) + " 입니다.");
		} else if (n <= 4000 ) {
			System.out.println("소득세는 " + ( 1000*(0.09)+((0.18)*(n-1000)) ) + " 입니다.");
		} else if (n < 8000 ) {
			System.out.println("소득세는 " + 
					( 1000*(0.09) + (3000*(0.18)) + ((0.27)*(n-4000)) ) + " 입니다.");
		} else {//if ( n >= 8000 ) {
			System.out.println("소득세는 " + 
			( 1000*(0.09) + (3000*(0.18)) + (4000*(0.27)) + ((0.36)*(n-8000)) ) 
								                      + " 입니다.");
		} 
		
		sc.close();

	}

}
