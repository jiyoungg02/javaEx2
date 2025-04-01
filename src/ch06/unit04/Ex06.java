package ch06.unit04;

public class Ex06 {
	public static void main(String[] args) {
		Test6 t = new Test6();
		
		// t.name = "홍길동"; // 컴오류. private은 외부에서 접근불가. 같은 클래스에서만 사용 가능
		t.setName("홍길동");
		t.setAge(20);
		
		String s = t.result();
		System.out.println(t.getName() + "님은 [" + s + "] 입니다.");
		
	}
}

// getter / setter : <shift> + <alt> + S R A
class Test6{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String result() {
		return age >= 10 ? "성인" : "미성년자";
	}
}