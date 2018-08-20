package honux.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		String PROMPT="cal>";
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하시오.");
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력하시오.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			
			if(month == -1) {
				break;
			} else if (month > 12) {
				continue;
			} else System.out.printf("%d월은 %d일입니다.\n",month,cal.maxDaysOfMonth(month));
			}
		scan.close();
		System.out.println("안녕~");
	}
	
}
		


