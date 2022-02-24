package classe;

public class DesafioData {
	int dia;
	int mes;
	int ano;

	DesafioData() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}

	DesafioData(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	public String ObterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	public void imprimirDataFormatada() {
		System.out.println(ObterDataFormatada());
	}
}
