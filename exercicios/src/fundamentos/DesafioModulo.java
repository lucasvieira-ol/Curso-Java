package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Valor: ");
		Double valueOne = input.nextDouble();
		
		System.out.print("Digite o segundo Valor: ");
		Double valueTwo = input.nextDouble();
		
		System.out.print("Digite a operação que deseja realizar: ");
		String operator = input.next();
		
		Double result = "+".equals(operator)? valueOne +  valueTwo : 0;
		result = "-".equals(operator) ? valueOne - valueTwo : result;
		result = "*".equals(operator) ? valueOne * valueTwo : result;
		result = "/".equals(operator) ? valueOne / valueTwo : result;
		
		
		System.out.println("O resultado é: " + result);
		
		input.close();
		
	}
}
