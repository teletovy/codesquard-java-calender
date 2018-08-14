package honux.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하시오.");
		int repeat = scan.nextInt();
		
		for(int i =1; i<=repeat; i++) {
			System.out.println("달을 입력하시오.");
			int month = scan.nextInt();
			System.out.printf("%d월은 %d일입니다.\n",month,cal.maxDaysOfMonth(month));
			}
		scan.close();
		System.out.println("안녕~");
	}
	
}
		


