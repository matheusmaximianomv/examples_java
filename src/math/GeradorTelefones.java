package math;

import java.util.Random;
import java.util.Scanner;

public class GeradorTelefones {
	public static void main(String[] args) {
		
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos números você quer gerar:");
		int rounds = input.nextInt();
		
		for(int i = 0; i < rounds; i++) {
			String DDD = Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10));
			String firstPart = Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10)) ;
			String secondPart = Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10))+Integer.toString(generator.nextInt(10)) ;
			
			String number = "(".concat(DDD).concat(")").concat(" ").concat(firstPart).concat("-").concat(secondPart);
			System.out.println(number);
		}
		
		input.close();
		
	}
}
