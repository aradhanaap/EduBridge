public class Main {
	public static void printNum(int a,int b) {
		if(b==5)
			return;
		System.out.println(a);
		printNum(a+2,b+1);
		
	}
	public static void main(String[] args) {
		printNum(0,0);
	}

}
