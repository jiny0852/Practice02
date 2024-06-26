package com.javaex.practice;
import java.util.Scanner;

public class Ex08 {

	//사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 저체중, 표준, 과체중을 구분하여 출력하 프
	//로그램을 작성하세요.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키 : ");
		double h = sc.nextInt();
		System.out.print("몸무게 : ");
		double w = sc.nextInt();
		
		double r = (h-100.0)*(0.9);
		
		if (w<r) {
			System.out.println("저체중 입니다.\n표준체중 : " + r);
		} else if (w==r) {
			System.out.println("표준 입니다.\n표준체중 : " + r);
		} else if (w>r) {
			System.out.println("과체중 입니다.\n표준체중 : " + r);
		}
		
		sc.close();

	}

}
