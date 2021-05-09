import java.util.Scanner;

public class ReverseBits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int newNumber=0;
		for(int i=0;i<32;i++) {
			newNumber<<=1;
			newNumber=newNumber|(n&1);
			n>>=1;
		}
		System.out.println(newNumber);
	}
}
