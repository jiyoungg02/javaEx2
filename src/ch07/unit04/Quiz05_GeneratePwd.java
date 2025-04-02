package ch07.unit04;

public class Quiz05_GeneratePwd {
	public static void main(String[] args) {
		Account obj = new Account();
		
		System.out.println(obj.generatepwd());
		System.out.println(obj.generatepwd());
		System.out.println(obj.generatepwd());

	}
}

// 영어대소문자, 숫자, 특수문자를 랜덤으로 조합하여 10자리 임시 패스워드 만들기
// (int)(Math.random()*10) => 0~9 사이의 난수
class Account {
	public String generatepwd() {
		StringBuilder sb = new StringBuilder();
		
		String s = "!@#%^&*_+=ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		int n;
		for(int i=0; i < 10; i++) {
			n = (int)(Math.random()*s.length());
			sb.append(s.charAt(n));
			// sb.append(s.substring(n, n+1));
		}
		
		return sb.toString();
	}
}