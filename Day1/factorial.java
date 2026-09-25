package support;

import java.util.Scanner;

public class factorial {
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		System.out.println("factorial of " +n+ " is " +fact(n));


//system.out.printf("the %d! is: %d",n,fact(n)
//using c language syntax  get same output
	}

}
/*static int factRec(int n){
    if(n==o)
       return 1;
    int fact=n*factRec(n-1);
       return fact;}
 public static void main(String[] args){*/
     
