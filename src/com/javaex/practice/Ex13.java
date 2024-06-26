package com.javaex.practice;
import java.util.Scanner;
//두 개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//)0은 입력하지 않습니다.)
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		if ( n1<n2 ) {
			if ( n2%n1 != 0 ) {
				System.out.println(n1 + "은(는) " + n2 + "의 약수가 아닙니다.");
			} else {
				System.out.println(n1 + "은(는) " + n2 + "의 약수 입니다.");
			}
		} else if ( n2<n1 ) {
			if (n1%n2 != 0) {
			System.out.println(n2 + "은(는) " + n1 + "의 약수가 아닙니다.");
			} else {
			System.out.println(n2 + "은(는) " + n1 + "의 약수 입니다.");
			}
		}
		
		
		sc.close();

	}

}
