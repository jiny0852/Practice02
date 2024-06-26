package com.javaex.practice;
import java.util.Scanner;
/*아래의 조건과 같이 출력되도록 프로그램을 작성하세요
⚫ 태어난 년도를 입력받습니다.
⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.)
⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다*/
public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int year = 2024;
		
		String n1 = null, n2 = null, n3 = null; //나이, 검강검진, 암검사
		
		
		
		System.out.print("태어난 연도를 입력해 주세요\n년도 : ");
		int user = sc.nextInt();
		
		if ( (year-user) < 20 ) {
			n1 = "20살 미만, 건강검진 대상이 아닙니다";
			n2 = "";
		} else {
			
			if (user%2 != 0) {//(year%2 == user%2 || user%2 != 0) {
				n1 = "20살 이상, 올해 건강검진 대상이 아닙니다";
			} else {
				n1 = "20살 이상, 올해 건강검진 대상 입니다";
			}
			
			
			if ( (year-user) > 40 ) {
				n2 = "암검사 무료대상 입니다";
			} else {
				n2 = "암검사 무료대상 아닙니다";
				
			}
		}
		
		System.out.println("올해 : " + year
		                   + "\n태어난 해 : " + user
				           + "\n나이 : " + (year-user)
		                   + "\n======================\n" 
		                   + n1 + "\n" + n2 );
		
		sc.close();

	}

}
