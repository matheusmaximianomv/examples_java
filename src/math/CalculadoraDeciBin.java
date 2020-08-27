package math;
import java.util.Scanner;

public class CalculadoraDeciBin {
	public static void decimalForBinary() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número decimal:");
		int decimal = input.nextInt();
		
		System.out.println("O número "+decimal+" em binário é: "+ Integer.toBinaryString(decimal));
		
		input.close();
	}
	
	public static void binaryForDecimal() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número em binário:");
		String binary = input.nextLine();
		
		System.out.println("O número "+binary+" em decimal é: "+ Integer.parseInt(binary, 2));
		
		input.close();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tipo de calculadora:");
		System.out.println("1 - Conversor de Binário para Decimal");
		System.out.println("2 - Conversor de Decimal para Binário");
		System.out.println("0 - Sair");
		
		switch (input.nextInt()) {
			case 1:
				binaryForDecimal();
				break;
			case 2:
				decimalForBinary();
				break;
			default:
				System.out.println("Obrigado por usar nosso sistema.");
				break;
		}
		
		input.close();
	}
}
