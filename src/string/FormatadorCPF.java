package string;
import java.util.Scanner;

public class FormatadorCPF {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número de cpf sem formação:");
		String cpfNoFormatted = input.nextLine();
		
		String cpf = cpfNoFormatted.substring(0, 3)+"."+cpfNoFormatted.substring(3, 6)+"."+cpfNoFormatted.substring(6, 9)+"-"+cpfNoFormatted.substring(9);
		
		System.out.println(cpf);
		
		input.close();
	}
}
