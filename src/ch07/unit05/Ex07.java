package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {
	public static void main(String[] args) {
		// 2001.07.07 ~ 오늘까지 날수 계산하기
		Date today = new Date();
		
		String birth = "2001-07-07";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date birthDate = sdf.parse(birth);
			
			// 두날짜 사이의 간격
			long dif = (today.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24);
			System.out.println("날수 : " + dif);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
