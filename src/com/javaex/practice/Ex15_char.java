package com.javaex.practice;
import java.util.Scanner;
/*아래와 같은 계산기 프로그램을 작성하세요.
⚫ 기호, 숫자1, 숫자2 순서로 입력받습니다.
⚫ 기호는 ( + - * / ) 4가지 입니다.
⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다*/
public class Ex15_char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호 : ");
		char n = sc.next().charAt(0);
		System.out.print("숫자1 : ");
		double n1 = sc.nextDouble();
		System.out.print("숫자2 : ");
		double n2 = sc.nextDouble();
		
		
		switch (n) {
		
			case '+':
				System.out.println("결과는 : " + (double)(n1+n2));
				break;
			case '-':
				System.out.println("결과는 : " + (double)(n1-n2));
				break;
			case '*':
				System.out.println("결과는 : " + (double)(n1*n2));
				break;
			case '/':
				if (n2 != 0) {
					System.out.println("결과는 : " + (double)(n1/n2));
				} else {
					System.out.println("계산할 수 없습니다.");
				}
				break;
			case '%':
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
			
		
		
		sc.close();

	}

}
