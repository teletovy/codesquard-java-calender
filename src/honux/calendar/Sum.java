package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("입력해주세요");
		int a,b;
		Scanner scan = new Scanner(System.in);
		String s1,s2;
		s1 = scan.next();
		s2 = scan.next();
		System.out.println(s1+"'"+s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

//		int c = a+b;
//		System.out.println("두수의 합은"+(a+b)+"입니다") ;
		System.out.printf("두수의 합은 %d 입니다" , a+b);
		scan.close();
	}
}

