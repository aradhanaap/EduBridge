package day1;
import java.util.Scanner;

public class Grade_cal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the marks");
		int marks=sc.nextInt();
		if(marks<0 || marks>100)
			System.out.println("invalid marks");
		else if(marks>=90)
		    System.out.println("Grade A");
		else if(marks>=75)
		    System.out.println("Grade B");
		else if(marks>=50)
		    System.out.println("Grade C");
		else
		    System.out.println("Grade F");
		    
		

	}

}
