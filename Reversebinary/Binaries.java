import java.util.Scanner;

public class Binaries {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		String originalBinary = Integer.toBinaryString(x);
		String reversedBinary = new StringBuilder(originalBinary).reverse().toString();		
		
		System.out.println(Integer.parseInt(reversedBinary, 2));
	}
}
