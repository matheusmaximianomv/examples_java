package string;
import java.util.Scanner;

public class ConverterAPara4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newName = "";
		
		System.out.println("Digite seu nome completo:");
		String name = input.nextLine();
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'A') {
				newName += '4';
			} else if(name.charAt(i) == 'e' || name.charAt(i) == 'E') {
				newName += '3';
			} else if(name.charAt(i) == 'o' || name.charAt(i) == 'O') {
				newName += '0';
			} else if(name.charAt(i) == 'i' || name.charAt(i) == 'I') {
				newName += '1';
			} else {
				newName += name.charAt(i);
			}
		}
		
		System.out.println(newName);
		
		input.close();
	}
}
