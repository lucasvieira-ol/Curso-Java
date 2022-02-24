package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.Nome = "Lucas";
		p.Peso = 70.0;
		
		Comida c = new Comida();
		c.Alimento = "Arroz e Feijao";
		c.Peso = 0.5;
		
		System.out.println("A pessoa chamada " + p.Nome + " comeu " + c.Alimento + " e agora pesa: " + p.Comer(c));
	}
}
