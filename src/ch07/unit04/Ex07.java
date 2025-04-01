package ch07.unit04;

public class Ex07 {
	public static void main(String[] args) {
		String s;
		int n, m;
		
		s = "    자    바    ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // 왼쪽과 오른쪽 공백 제거
		System.out.println(":" + s.replaceAll("\\s", "") + ":");		
		
		n = 30;
		// s = n; // 컴파일 오류
		// s = "" + n; // 정수를 문자열로(문자열 + 기본자료형 => 문자열)
		s = Integer.toString(n);
		System.out.println(s);
		
		n = 123456;
		m = 15;
		s = String.format("%,d", n);
			// 서식에 따라 문자열로 변환
			// printf()와 유사
		System.out.println(s);
		
		s = String.format("%d %d %d", n, m, n);
		System.out.println(s);
		
		s = String.format("%1$d %2$d %1$d", n, m);
		System.out.println(s);
		
		s = "자바,스프링,오라클,HTML";
		String []ss = s.split(",");
			// , 로 분리하여 배열을 반환
		for(String a : ss) {
			System.out.println(a);
		}
		
		// 문자열의 각 문자에 대한 ASCII 코드값을 byte 배열로 반환
		s = "KOREA";
		byte[] bb = s.getBytes();
		for(byte b : bb) {
			System.out.println(b); // 75 79 82 69 65
		}
		
	}
}
