package info.dyndns.overflow.java;

import java.util.Map;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later 
 *
 */
class ProceduralFizzBuzz extends AbstractFizzBuzz {
	ProceduralFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	Map<Integer, String> createResult(Map<Integer, String> map) {
		for(int i = 0;i < max;i++){
			map.put(i, FizzBuzzFactory.FizzBuzzCalc(i));
		}
		return map;
	}

}
