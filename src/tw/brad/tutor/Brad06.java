package tw.brad.tutor;

import java.util.Scanner;

public class Brad06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Year = ");
		int year = scanner.nextInt();
//		System.out.print(year);
		
		boolean isLeap = true;
		
		if (year % 400 == 0){
//			System.out.println("是閏年");
			isLeap = true;
		}
		else if (year % 4 == 0 && year % 100 == 0){
//			System.out.println("不是閏年");
			isLeap = false;
		}
		else if (year % 4 == 0) {
//			System.out.println("是閏年");
			isLeap = true;
		}
		else {
//			System.out.println("不是閏年");
			isLeap = false;
		}
		System.out.printf("%d年是%s年", year, isLeap?"潤":"平");

	}

}
