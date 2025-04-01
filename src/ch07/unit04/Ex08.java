package ch07.unit04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// 입력 받은 문자열 중 대소문자를 구분하지 않고 abc로 시작하는 문자열 수
		// 단 입력 받은 문자열이 end(대소문자 구별 안함)이면 개수 출력 후 종류
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		String s;
		
		do {
			System.out.print("문자열 ? ");
			s = sc.next();
			
			if(s.toLowerCase().indexOf("abc") == 0) {
				count++;
			}
		}while(!s.equalsIgnoreCase("end"));
		
		/*
		do {
			System.out.print("문자열 ? ");
			s = sc.next();
			s = s.substring(0,3);
			
			if(s.equalsIgnoreCase("abc")) {
				count++;
			}
		}while(!s.equalsIgnoreCase("end"));
		*/
		System.out.println("문자열 수 : " + count);
		
		sc.close();
	}
}
