package info.dyndns.overflow.java;

import java.util.Map;
import java.util.stream.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public class ParallelStreamFizzBuzz extends AbstractFizzBuzz {

	ParallelStreamFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	Map<Integer, String> createResult(Map<Integer, String> map) {
		 IntStream.range(1,this.max).parallel()
		 					.forEach(i -> map.put(i,FizzBuzzFactory.FizzBuzzCalc(i)));
			return map;
	}
}
