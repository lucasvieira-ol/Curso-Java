package operadores;

public class DesafioOperadorAritmetico {
	public static void main(String[] args) {
		double firstPart = (Math.pow(6 *(3 + 2),2) / (3 * 2));
		double secondPart = Math.pow(((1-5)*(2-7))/2, 2);
		double thirdPart = Math.pow(firstPart - secondPart, 3) / Math.pow(10, 3);
		
		System.out.println("Primeira parte: " + firstPart);		
		System.out.println("Segunda parte: " + secondPart);
		System.out.println("O resultado é : " + thirdPart);
	}
}
