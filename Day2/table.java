package Dsa;
import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("multiplication table");
		for(int i=0;i<=10;i++)
		{
			int result=i*n;
			System.out.println(i + "*" + n + "=" + result);
		}
			

	}

}
