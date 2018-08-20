package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
				
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력하시오.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			if(month == -1) {
				break;
			} 
			
			if (month > 12) {
				continue;
			} 
			cal.printCalendar(2018, month);	
		}
		
		scan.close();
		System.out.println("안녕~");
	}
		
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		}

}
