package ch07.unit03;

public class Ex04_double {
	public static void main(String[] args) {
		double d;
		String s;
		
		s = "1213.57";
		d = Double.parseDouble(s); // String을 double로
		System.out.println(d);
		
		d = Double.valueOf(s); // String을 double로
		System.out.println(d);
		
		System.out.println(Double.toString(d));
			// double을 String으로
		
	}
}
