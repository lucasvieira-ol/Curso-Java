package array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		double[][] arrayTest = new double[3][3];

		Scanner input = new Scanner(System.in);

		
		for (int i = 0; i < arrayTest.length; i++) {
			
			for (int j = 0; j < arrayTest[i].length; j++) {

				System.out.print(String.format("Digite o número desejado da coluna %d e linha %d: ", i+1, j+1));
				arrayTest[i][j] = input.nextDouble();
			}
		}
		System.out.println("Os valores da matriz são: " + Arrays.deepToString(arrayTest));
		input.close();
	}
}
