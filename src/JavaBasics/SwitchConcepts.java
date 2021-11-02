package JavaBasics;

import java.util.Scanner;

public class SwitchConcepts {

	public static void main(String[] args) {

		int age;
		System.out.println("Enter your Age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		switch (age) {
		case 18:
			System.out.println("Your are Adult");
			break;

		case 23:
			System.out.println("You are going to join job");
			break;

		case 30:
			System.out.println("You are going to get married");
			break;
		case 60:
			System.out.println("You are going to retire");
			break;

		default:
			System.out.println("Inavalid age");
			
		}
	}

}
