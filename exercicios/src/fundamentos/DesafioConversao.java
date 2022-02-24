package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Salário: ");
		String firstValue = input.nextLine();
		
		System.out.print("Digite o segundo Salário: ");
		String secondValue = input.nextLine();
		
		System.out.print("Digite o terceiro Salário: ");
		String thirdValue = input.nextLine();
		
		System.out.print(" Média dos salários: ");
		System.out.println((ConvertionDouble(firstValue) + ConvertionDouble(secondValue) + ConvertionDouble(thirdValue))/3);
		
		input.close();
	}
	
	public static double ConvertionDouble(String value) {
		
		return Double.parseDouble(value.replace(",", "."));
	}
}
