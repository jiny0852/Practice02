package com.javaex.practice;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age; //나이
		
		//나이 입력 받기
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		//그릅을 분류
		if(age > 20) {
			System.out.println("\"1번그룹\""); //"1번그룹"\n입니다.
		} else { //20살 이하이면
			System.out.println("\'2번그룹\'"); //'2번그룹'\n입니다.
		}
		System.out.println("입니다.");
		
		sc.close();
		/*
		(1)15일 때 결과    "1번그룹"\n입니다.
		(2)19일 때 결과    "1번그룹"\n입니다.
		(3)20일 때 결과    '2번그룹'\n입니다.
		(4)21일 때 결과    '2번그룹'\n입니다.
		(5)100일 때 결과   '2번그룹'\n입니다.
		*/
		

	}

}
