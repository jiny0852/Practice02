package com.javaex.practice;
import java.util.Scanner;
/*알파벳을 입력받아 자음 모음을 구분하세요.
⚫ if~else문을 사용합니다.
⚫ 영문 소문자 이외의 입력값은 고려하지 않습니다.*/
public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 1글자(소문자)를 입력하세요\n알파벳 : ");
		String a = sc.nextLine();
		
		if ( a.equals("a") || a.equals("e") || a.equals("i") 
				|| a.equals("o") || a.equals("u") ) {
			System.out.println("모음입니다");
		} else {
			System.out.println("자음입니다");
		}
		
		
		sc.close();

	}

}
