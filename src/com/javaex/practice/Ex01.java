package com.javaex.practice;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		다음중 에러가 발생하는 문장은
		(1) if( i=0 ) {….}
		(2) if( j<10 ) {…}
		(3) switch( 'A' ){….}
		(4) switch( 100 ){…}
		(5) switch( "A" ){…}
		(6) if( name == "홍길동" )
		
		
		
		(3) switch( 'A' ){….}
		(4) switch( 100 ){…}
		(5) switch( "A" ){…}   
		switch 입력변수 자료형은 int 외의 정수형, char, String
		셋다 가능
		
		(6) if( name == "홍길동" ) String(문자열)은 .equals()로 비교
			
		*/	
		
		switch ("a") {
		
		}
		
		sc.close();

	}

}
