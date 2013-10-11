package info.dyndns.overflow.java;

import java.util.concurrent.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later 
 *
 * TODO Future and F/J migrate ok?
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
