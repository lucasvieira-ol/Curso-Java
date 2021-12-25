package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double tempF = 100;

		System.out.println(ConvertToCelsius(tempF));
	}

	public static String ConvertToCelsius(double tempF) {

		final int FIRST = 32;
		final double SECOND = 5 / 9.0;

		double result = (tempF - FIRST) * SECOND;
		
		return (Double.toString(tempF) + "°F é igual a " + Double.toString(result) + "°C");

	}
}
