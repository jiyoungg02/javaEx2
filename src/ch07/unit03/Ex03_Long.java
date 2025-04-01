package ch07.unit03;

public class Ex03_Long {
	public static void main(String[] args) {
		long a= 10; // 10은 int형으로 long로 변환 되어 a에 저장
		// Long b = 10; // 컴파일오류. 형변환이 안되기 때문에
		Long b = 10L; // 10L : long 형 리터널
		
		//int x = a; // 컴오류
		int x = (int)a;
		
		// Integer y = (Integer)b; //컴오류
		// 클래스는 상하관계만 형변환이 가능하며
		// Integer과 Long은 상하관계가 아니므로 형변환 불가
	
		String s = "123";
		long y = Long.parseLong(s); // 문자열을 long로 형 변환
		
		Integer m = 10;
		long n = m; // 가능
		
		System.out.println(a + ", " + b);
		System.out.println(x + ", " + y);
		System.out.println(m + ", " + n);
	}
}
