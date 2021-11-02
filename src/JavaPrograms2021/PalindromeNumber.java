package JavaPrograms2021;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int temp=num;
		int rev=0,rem;
		while (temp!=0) 
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) 
		{
			
			System.out.println(num +" its a Palindrome number");
			
		}else 
		{
			
			System.out.println("its not a palindrome number");
		}
		
		//Approach2 : using String builder
		
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder reversed=sb.reverse();
		System.out.println("Reverse of the number is :"+sb);
		
			
		}
	}


