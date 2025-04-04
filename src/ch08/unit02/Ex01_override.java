package ch08.unit02;

public class Ex01_override {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.disp();
		obj.write();
		obj.disp(5);
	}
}

class Test1{
	int a = 10;
	
	public void disp() {
		System.out.println("a:" + a);
	}
}

/*
	- 메소드 override
	  : 상위 클래스의 메소드를 하위 클래스에서 재정의
	  : override 는 상관(상속)관계에서만 가능하다.
	  : 메소드의 시그너처가 동일해야 한다. - 메소드 이름, 반환값, 접근제어자(크거나 같아야함)
	  : 접근 제어자는 크거나 같아야 한다.
	  : 예외는 뺄수는 있지만 추가할 수는 없다.
	  : 상위 클래스의 메소드를 재정의(override)하면 
	    상위 클래스의 메소드는 숨는다.
	  : @Override 애노테이션
	    메소드가 override 규칙에 맞는지 검증하여 맞지 않으면 에러가 발생
*/

class Demo1 extends Test1{
	int x = 100;
	
	public void write() {
		// disp(); // 자신의 disp() 호출
		super.disp(); // super 클래스의 disp() 호출
		
	}
	
	// override
	@Override
	public void disp() {
		System.out.println("a:" + a + ", x:" +x );
	}
	
	// overloading
	public void disp(int n) {
		System.out.println("n : " + n);
	}
}