package support;

public class fibnacci {

	public static void main(String[] args) {
		int count=9;
		int a=0;
		int b=1;
		System.out.println("fibonacci sequence");
		for(int i=0;i<=count;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
/*static void fibo(int n)
int a=0,b=1;
for(int i=0;i<=n;i++){                                 //USING RECURSION
sout(a);
int c=a+b;
a=b;
b=c;}
public static void main(str arg){
int n=10;
fibo(n);}*/
