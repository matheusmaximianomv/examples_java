package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneValidator {

	
	public static void main(String[] args) throws FileNotFoundException {
		final String PATH = ".../src/files/numeros.txt";
		
		Scanner input = new Scanner(new FileReader(PATH));
		
		while(input.hasNextLine()) {
			String phone = input.nextLine();
			
			if (phone.charAt(0) != '(') {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(1))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(2))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (phone.charAt(3) != ')') {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (phone.charAt(4) != ' ') {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(5))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(6))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(7))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(8))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (phone.charAt(9) != '-') {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(10))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(11))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(12))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else if (!Character.isDigit(phone.charAt(13))) {
				System.out.println("Phone ".concat(phone).concat(": Inválido."));
			} else {
				System.out.println("Phone ".concat(phone).concat(": Válido."));
			}
		}
		
		input.close();
	}
}
