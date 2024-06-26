package com.javaex.practice;
import java.util.Scanner;

//두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요
public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		if ( n1 > n2 ) {
			System.out.println("큰수 : " + n1 + "    작은수 : " + n2 + "입니다.");
		} else {//if ( n1 < n2 ) {
			System.out.println("큰수 : " + n2 + "    작은수 : " + n1 + "입니다.");
		}
		
		
		
		sc.close();

	}

}
