package com.javaex.practice;
import java.util.Scanner;

public class Ex07 {

	//나이를 입력받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요\n나이 : ");
		int age = sc.nextInt();
		
		String s = null;
		
		if (age<8) {
			s = "취학전아동/무료";
		} else if (age<14) {
			s = "초등학생/2000원";
		} else if (age<17) {
			s = "중학생/3000원";
		} else if (age<20) {
			s = "고등학생/4000원";
		} else {
			s = "성인/5000원";
		} 
		
		System.out.println(s + " 입니다.");
		
		sc.close();

	}

}
