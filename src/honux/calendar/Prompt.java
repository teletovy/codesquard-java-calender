package honux.calendar;

import java.util.Scanner;

public class Prompt {
			
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
				
		int month = 1;
		int year = 2017;
		
		while(true) {
			System.out.println("년도를 입력하시오.");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			System.out.println("달을 입력하시오.");
			System.out.print("MONTH> ");
			month = scan.nextInt();
			if(month == -1) {
				break;
			} 
			
			if (month > 12) {
				continue;
			} 
			cal.printCalendar(year, month);	
		}
		
		scan.close();
		System.out.println("안녕~");
	}
		
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		}

}
