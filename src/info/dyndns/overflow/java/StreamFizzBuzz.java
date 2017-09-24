package info.dyndns.overflow.java;

import java.util.Map;
import java.util.stream.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public class StreamFizzBuzz extends AbstractFizzBuzz {

	StreamFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	Map<Integer, String> createResult(Map<Integer, String> map) {
		 Map<Integer, String> data = IntStream.range(0,this.max)
		 																			.forEach(i -> map.put(i,FizzBuzzFactoryFizzBuzzCalc(i)));
			return map;
	}
}
