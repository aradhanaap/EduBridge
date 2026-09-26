package day2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int reverseNum=0;
		while(num!=0) {
			 int lastDigit = num % 10;
			 reverseNum = reverseNum * 10 + lastDigit;
			 num = num / 10; 
		}
		System.out.println("Reversed Number: " + reverseNum);if (n == reverseNum) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is NOT a palindrome.");
        }
		

	}

}
