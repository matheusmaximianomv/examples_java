package date;
import java.util.Scanner;

public class FormatandoData {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Digite a data no formato BR para converter no formato americano YYYY-DD-MM");
		String data = input.nextLine();
		
		String[] dataFragmented = data.split("/");
		
		System.out.println(dataFragmented[2].concat("/").concat(dataFragmented[0].concat("/").concat(dataFragmented[1])));
		
		input.close();
	}
}
