package files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeitorNomes {
	public static void main(String[] args) throws FileNotFoundException {
		final String PATH = ".../src/files/nomes.txt";
		
		Scanner input = new Scanner(new FileReader(PATH));
		
		while(input.hasNextLine()) {
			String name = input.nextLine(), newName = "";
			
			for(int i = 0; i < name.length() && name.charAt(i) != ' '; i++) {
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
			
			System.out.println(name.concat(" || ").concat(newName));
		}
		
		input.close();
	}
}
