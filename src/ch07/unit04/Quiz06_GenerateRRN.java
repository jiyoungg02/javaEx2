package ch07.unit04;

public class Quiz06_GenerateRRN {

	public static void main(String[] args) {
		RRNGenerator gen = new RRNGenerator();

        System.out.println(gen.generateRRN());
        System.out.println(gen.generateRRN());
        System.out.println(gen.generateRRN());
	}
}

class RRNGenerator {
    public String generateRRN() {
        // 생년월일: 1970~2025년 사이
        int year = 1970 + (int)(Math.random() * 56); // 1970~2025
        int month =(int)(Math.random() * 12) + 1;

        int day = getRandomDay(year, month);

        // 성별코드: 1~4 중 랜덤
        int gender = getGenderNum(year);
        // 뒤 6자리 무작위
        int rearNumber = (int)(Math.random() * 1000000); // 000000~999999

        String front = String.format("%02d%02d%02d", year % 100, month, day);
        String rear = String.format("%d%06d", gender, rearNumber);

        return front + "-" + rear;
    }
    
    // 주민번호 뒷자리 성별 숫자 구하기 
    private int getGenderNum(int year) {
    	int gender;
    	if(year<2000) {
    		gender = (int)(Math.random()*2) + 1; // 1~2
    	}else {
    		gender = (int)(Math.random()*2) + 3; // 3~4
    	}
    	
    	return gender;
    }
    
    private int getRandomDay(int year, int month) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // 윤년이면 2월은 29일로 변경
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return (int)(Math.random() * daysInMonth[month - 1]) + 1;
    }
    
    // 윤년계산
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
