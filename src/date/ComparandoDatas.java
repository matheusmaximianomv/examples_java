package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ComparandoDatas {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite a primeira data a ser comparada:");
		Date firstDate = format.parse(input.nextLine());
		
		System.out.println("Digite a segunda data a ser comparada:");
		Date secondDate = format.parse(input.nextLine());
		
		if (firstDate.compareTo(secondDate) > 0) {
			System.out.println(firstDate);
		} else if (firstDate.compareTo(secondDate) 	< 0) {
			System.out.println(secondDate);
		} else {
			System.out.println("Datas equivalentes");
		}
		
		input.close();
	}
}
