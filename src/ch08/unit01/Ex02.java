package ch08.unit01;

public class Ex02 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		
		obj.disp();
		obj.print();
	}
}

class Test2{
	int a = 10;
	int b = 20;
	
	public void print() {
		// System.out.println(this.a + ":" + this.b);;
		System.out.println(a + ":" + b); // this 생략 가능
	}
}

class Demo2 extends Test2{
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x = 50;
		
		System.out.println("a:" + a); // 10, super 클래스의 a 필드
		System.out.println("this.a:" + this.a); // 10, super 클래스의 a 필드
		System.out.println("super.a:" + super.a); // 10, super 클래스의 a 필드
		
		System.out.println("b:" + b); // 100, 자신클래스의 b
		System.out.println("this.b:" + this.b); // 100, 자신클래스의 b
		System.out.println("super.b:" + super.b); // 20, super 클래스의 b
		
		System.out.println("x:" + x); // 50, 지역변수
		System.out.println("this.x:" + this.x); // 200, 자신클래스의 x 필드
			
		System.out.println("y:" + y); // 300, 자신클래스의 y 필드
		System.out.println("this.y:" + this.y); // 300, 자신클래스의 y 필드
	}
	
}