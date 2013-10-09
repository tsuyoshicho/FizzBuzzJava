package info.dyndns.overflow.java;

import java.util.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later 
 *
 */
public abstract class AbstractFizzBuzz implements FizzBuzz {
	protected int max;
	AbstractFizzBuzz(Integer max) {
		this.max = max;
	}
	
	abstract Map<Integer,String> createResult(Map<Integer,String> map);
	@Override
	public Map<Integer, String> result() {
		return createResult(new TreeMap<Integer,String>());
	}

}