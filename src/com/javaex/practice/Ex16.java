package com.javaex.practice;
import java.util.Scanner;

//다음과 같이 정의되는 함수의 함수값을 계산해보자
public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요\n숫자 : ");
		double n = sc.nextDouble();
		double r;
		
		if( n <= 0 ) {
			r = n*n*n-9*n+2;
		} else {
			r = 7*n+2;
		}
		System.out.println("계산 결과는 " + r + " 입니다.");
		
		sc.close();

	}

}
