package com.javaex.practice;
import java.util.Scanner;

//숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요 
public class Ex22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		System.out.print("숫자3 : ");
		int n3 = sc.nextInt();
		
		if ( n1 > n2 && n1 > n3 ) {
			System.out.println("가장 큰 수는 " + n1 + " 입니다.");
		} else if ( n2 > n1 && n2 > n3 ) {
			System.out.println("가장 큰 수는 " + n2 + " 입니다.");
		} else if ( n3 > n1 && n3 > n2 ) {
			System.out.println("가장 큰 수는 " + n3 + " 입니다.");
		}
		
		
		sc.close();

	}

}
