package utils;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utils {
	public final static Function<Integer, String> binaryString = item -> Integer.toBinaryString(item);
	public final static UnaryOperator<String> stringInverter = item -> {
		StringBuilder sb = new StringBuilder(item);
		sb.reverse();
		return sb.toString();
	};
	public final static Function<String, Integer> binaryToInteger = item -> Integer.parseInt(item, 2);
	public final static Consumer<Object> print = System.out::println;
	
}
