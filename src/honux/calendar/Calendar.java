package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	public static void main(String[] args) {
		System.out.println("달을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int result = maxdays[a-1];
		if(a<1) {
			System.out.println("오류");
			
		}
		else if (a>12) {
			System.out.println("오류");
		}
		else  {
			System.out.printf("%d월은 %d일 까지 있습니다",a,result);
		}
			
		}
		}
		


