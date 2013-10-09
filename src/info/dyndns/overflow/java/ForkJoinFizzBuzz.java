package info.dyndns.overflow.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later 
 *
 */
public class ForkJoinFizzBuzz extends AbstractConcurrentFizzBuzz {

	ForkJoinFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	ExecutorService getExecutor(){
		return new ForkJoinPool();
	}
}