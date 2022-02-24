package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData data = new DesafioData();
		data.ano = 1999;
		data.mes = 07;
		data.dia = 23;
		
		System.out.println(Integer.toString(data.dia) + "/" + Integer.toString(data.mes) + "/" + Integer.toString(data.ano));
	
	}
}
