package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
		
	public static void main(String[] args) {
		System.out.println("달을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = scan.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month , cal.maxDaysOfMonth(month) );
		scan.close();
		}}
		


