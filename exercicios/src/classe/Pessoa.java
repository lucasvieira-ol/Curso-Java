package classe;

public class Pessoa {
	String Nome;
	double Peso;

	public double Comer(Comida comida) {
		Peso += comida.Peso;
		return Peso;
	}
}
