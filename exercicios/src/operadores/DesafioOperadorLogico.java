package operadores;

import java.util.Scanner;

public class DesafioOperadorLogico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("O trabalho de terça deu certo? ");
		String resOne = input.next();

		System.out.print("O trabalho de quinta deu certo? ");
		String resTwo = input.next();

		boolean resultOne = resOne.toLowerCase().contains("s") ? true : false;
		boolean resultTwo = resTwo.toLowerCase().contains("s") ? true : false;

		if (resultOne && resultTwo) {
			System.out.println("Comprar a TV de 50 e tomar sorvete");
		} else if (resultOne || resultTwo) {
			System.out.println("Comprar a TV de 32 e tomar sorvete");
		} else
			System.out.println("Ficar em casa");
		
		input.close();

	}
}
