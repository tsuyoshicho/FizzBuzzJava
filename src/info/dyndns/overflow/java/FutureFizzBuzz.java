package info.dyndns.overflow.java;

import java.util.concurrent.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
class FutureFizzBuzz extends AbstractConcurrentFizzBuzz {
	FutureFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	ExecutorService getExecutor(){
		return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

}
