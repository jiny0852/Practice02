package com.javaex.practice;
import java.util.Scanner;

//두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		if ( n1 > n2 ) {
			System.out.println("몫 : " + n1/n2 + "\n나머지 : " + n1%n2);
		} else {
			System.out.println("몫 : " + n2/n1 + "\n나머지 : " + n2%n1);
		}
		
		
		
		sc.close();

	}

}
