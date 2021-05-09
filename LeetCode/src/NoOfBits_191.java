import java.util.Scanner;

public class NoOfBits_191 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while (n != 0) {
			n = (n & (n - 1));
			count+=1;
		}
		System.out.println(count);
	}
}
