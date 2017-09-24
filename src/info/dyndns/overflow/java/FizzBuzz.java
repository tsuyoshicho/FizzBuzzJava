package info.dyndns.overflow.java;

import java.util.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public interface FizzBuzz {
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String FIZZBUZZ = "FizzBuzz";

	Map<Integer,String> result();
}
