package lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 2500.0, 0.0);
		
		BiFunction<Double, Double, Double> precoReal = (valor, desconto) -> valor * (1 - desconto);
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500.0 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000.0 ? valor + 100 : valor + 50;
		Function<Double, BigDecimal> arredondar = valor -> new BigDecimal(valor).setScale(2, RoundingMode.HALF_DOWN);
		Function<BigDecimal, String> formatar = valor -> "R$" + valor.toString().replace(".", ",");
		
		String result = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p.preco, p.desconto);
		
		System.out.println(result);
	}
}
