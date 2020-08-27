package string;

import java.util.Scanner;

public class LeitorDePalaras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu texto:");
		String text = input.nextLine();
		
		String[] works = text.split(" ");
		
		System.out.println("O texto tem "+works.length+" palavra(s).");
		
		input.close();
	}
}
