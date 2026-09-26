package day2;

public class SumEvenNum {

	public static void main(String[] args) {
	int sum=0;
	int i=2;
	while(i<=100)
	{
		if(i%2==0)
			sum+=i;
		i++;
	}
	System.out.println("Sum of even numbers from 1 to 100 is =" + sum);
			
	}

	}


