package ch07.unit06;

import java.util.Random;
import java.util.Scanner;

/*
	Q 1~100 사이의 난수를 발생하여 20번 안에 알아 맞추는 게임
	  20번 안에 맞추지 못하면 실패했습니다. 출력 후 종료
	  
	  - 실행 예 : 발생도 난수가 23인 경우
	  
	    수 ? 3
	    3보다 큰수입니다.
	    
	    수 ? 50
	    50보다 작은수입니다.
	    
	    수 ? 23
	    3번에 성공했습니다.
*/

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		int n = rnd.nextInt(100)+1;
		int input, count = 0;
		
		//System.out.println(n);
		
		do {
			count++;
			
			System.out.print("수 ? ");
			input = sc.nextInt();
			
			if(count==20 && input!=n) {
				System.out.println("실패했습니다.");
				break;
			}else if(input > n) {
				System.out.printf("%d보다 작은수입니다.\n", input);
			}else if(input < n) {
				System.out.printf("%d보다 큰수입니다.\n", input);
			}else{
				System.out.printf("%d번에 성공했습니다.", count);
				break;
			}
			System.out.println();
		}while(true);
		
		/*
		do {
			count++;
			
			System.out.print("수 ? ");
			input = sc.nextInt();
			
	
			if(input > n) {
				System.out.printf("%d보다 작은수입니다.\n", input);
			}else if(input < n) {
				System.out.printf("%d보다 큰수입니다.\n", input);
			}else{
				System.out.printf("%d번에 성공했습니다.", count);
			}
			count++;
		}while(n != input && n < 20);
		
		System.out.println(n);
		if(input!=n){
			System.out.println("실패했습니다.");
		}
		 */
		
		sc.close();
	}
		
}
