package info.dyndns.overflow.java;

import java.util.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public abstract class AbstractFizzBuzz implements FizzBuzz {
	protected Integer max;
	AbstractFizzBuzz(Integer max) {
		if(max < 1){
			throw new IllegalArgumentException("under 0:" + max);
		}

		this.max = max;
	}

	abstract Map<Integer,String> createResult(Map<Integer,String> map);

	@Override
	public Map<Integer, String> result() {
		return createResult(new TreeMap<Integer,String>());
	}

}
