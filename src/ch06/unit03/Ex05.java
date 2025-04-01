package ch06.unit03;

public class Ex05 {
	int width;
	int height;
	
	public int area() {
		return width * height;
	}
	
	public static void main(String[] args) {
		//width = 10; //컴오류. 클래스 메소드는 인스턴스 변수를 객체를 생성하지 않으면 사용할 수 없다
		Ex05 obj = new Ex05();
		obj.width = 10;
		obj.height = 20;
		
		int s = obj.area();
		System.out.println("결과 : " + s );
		
	}
}
