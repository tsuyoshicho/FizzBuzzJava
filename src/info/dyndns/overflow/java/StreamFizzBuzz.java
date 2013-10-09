package info.dyndns.overflow.java;

import java.util.Map;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later 
 * FIXME:in Java8
 */
public class StreamFizzBuzz extends AbstractFizzBuzz {

	StreamFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	Map<Integer, String> createResult(Map<Integer, String> map) {
		// java.util.stream.IntStream.range(0,max).parallelStream().collect(i -> map.put(i,FizzBuzzFactory.Calc(i)))
		return map;
	}

}
