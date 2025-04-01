package ch06.unit03;

public class Ex14_overloading {

	public static void main(String[] args) {
		Test14 t = new Test14();
		
		t.print();
		
		byte b = 10;
		t.print(b); // short. 10 매개변수의 타입이 크거나 같은것 중 가장 작은것
		
		char c = 'A';
		t.print(c); // int. 65
		
		int i = 10;
		t.print(i); // int. 10
		
		long l = 10;
		t.print(l); // double. 10.0
	}
}

// overloading
//	: 중복정의
//	: 메소드의 이름은 동일하지만 괄호안에 오는 매개변수의 개수가 다르거나 타입이 다른 경우
class Test14{
	public void print() {
		System.out.println("인자 없는 메소드...");
	}
	
	/*
	//컴파일 오류 : overloading이 아님
	public int print() {
		return 1;
	}
	*/
	
	public void print(short n) {
		System.out.println("short : " + n);
	}
	
	public void print(int n) {
		System.out.println("int : " + n);
	}
	
	public void print(double n) {
		System.out.println("double : " + n);
	}
	
}