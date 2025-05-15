package ch07.unit04;

/*
	- StringBuilder, StringBuffer
	  : 가변적인 문자열을 처리하는 경우 String보다 처리 속도가 빠르다.
	  : 가변적인 문자열을 처리하지 않는 경우에는 String을 사용한다.
	  : StringBuilder 는 StringBuffer 모든 작업이 끝나고 일반적으로 String으로 변환하여 사용한다.
	- StringBuilder
	  : 동시성을 지원하지 않는다. - 동시에 일이 일어날 수 있다.
	  : StringBuffer 보다 처리 속도가 빠르다.
	  : 동시성의 문제가 발생하지 않으면 StringBuilder를 사용한다.
	- StringBuffer
	  : 동시성을 지원한다. - 동시에 일을 못하게 막는다.
	  : 동시성의 문제가 발생할 경우에는 StringBuffer를 사용한다. 
*/

public class Ex11_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("seoul");
		StringBuilder sb2 = new StringBuilder("seoul");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2); // false 주소비교
		System.out.println(sb1.equals(sb2)); // false 주소비교
			// StringBuilder equals() 는
			// Object의 equals()는 주소를 비교
		
		//StringBuilder를 문자열로 변환
		String s = sb1.toString();
		System.out.println(s);
		
		// StringBuilder나 StringBuffer는 문자열을 비교할때
		// String으로 변환하여 비교해야 한다.
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		String s2 = "korea";
		String s3 = new String("korea");
		String s4 = "seoul";
		
		// String contentEquals() : 다른 객체와 문자열 비교
		System.out.println(s2.equals(s3)); // true 같은 객체라 equals() 가능
		System.out.println(s2.contentEquals(s3)); // true
		// System.out.println(s4.equals(sb1)); // false. 문자열을 비교하지 않고 주소 비교. 경고(다른 객체)
		System.out.println(s4.contentEquals(sb1)); // true
		
	}
}
