package math;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite respectivamente os valores A, B e C da equação:");
		int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();
		
		double delta = Math.pow(B, 2) - 4 * A * C;
		double xI = (Math.negateExact(B) + Math.sqrt(delta)) / (2 * A);
		double xII = (Math.negateExact(B) - Math.sqrt(delta)) / (2 * A);
		
		System.out.println("XI = "+xI+"; XII = "+xII);
		
		input.close();
	}
}
