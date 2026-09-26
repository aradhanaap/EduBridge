package Dsa;

public class countNum {

	public static void main(String[] args) {
		int num=45823; 
		int Count=0;
		int temp=num;
		while(temp>0) {
			temp/=10;
			Count++;
		}
		System.out.println(num + " has " + Count + " digits");

	}

}
