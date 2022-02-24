package stream;

import java.util.Arrays;
import java.util.List;


import utils.Utils;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums
		.stream()
		.map(Utils.binaryString)
		.map(Utils.stringInverter)
		.map(Utils.binaryToInteger)
		.forEach(Utils.print);
		
	}
}
