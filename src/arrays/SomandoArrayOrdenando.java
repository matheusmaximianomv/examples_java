package arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SomandoArrayOrdenando {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int[] numberUser = new int[5];
		int[] numberMachine = new int[10];
		int[] sumArryas = new int[numberUser.length + numberMachine.length];
		
		for(int i = 0; i < 5; i++) {
			numberUser[i] = input.nextInt();
			numberMachine[i] = generator.nextInt(101);
		}
		
		for(int i = 0, j = 0; i < sumArryas.length; i++) {
			if(i < numberUser.length) sumArryas[j++] = numberUser[i];
			if(i < numberMachine.length) sumArryas[j++] = numberMachine[i];
		}
		
		System.out.println("Apresentando os números não ordenados:");
		for(int i = 0; i < sumArryas.length; i++) {
			System.out.print(sumArryas[i]+" ");
		}
		
		Arrays.sort(sumArryas);
		
		System.out.println("\nApresentando os números não ordenados:");
		for(int i = 0; i < sumArryas.length; i++) {
			System.out.print(sumArryas[i]+" ");
		}
		
		input.close();
	}
}
