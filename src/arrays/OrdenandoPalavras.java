package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenandoPalavras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> palavras = new ArrayList<String>();
		
		System.out.println("Quantas palavras serão adicionadas:");
		int rounds = input.nextInt();
		
		// Eliminando o \n da entrada de dados;
		input.nextLine();
		
		for(int i = 0; i < rounds; i++) {
			System.out.println("Adicione a "+(i+1)+"ª palavra:");
			palavras.add(input.nextLine());
		}
		
		System.out.println("Palavras sem ordem:");
		for(String palavra: palavras) {
			System.out.print(palavra+" ");
		}
		
		Collections.sort(palavras);
		
		System.out.println("Palavras em ordem:");
		for(String palavra: palavras) {
			System.out.print(palavra+" ");
		}
		
		input.close();
	}
}
