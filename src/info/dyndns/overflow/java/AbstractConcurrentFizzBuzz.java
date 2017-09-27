package info.dyndns.overflow.java;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public abstract class AbstractConcurrentFizzBuzz extends AbstractFizzBuzz {

	public AbstractConcurrentFizzBuzz(Integer max) {
		super(max);
	}

	@Override
	protected Map<Integer, String> createResult(Map<Integer, String> map) {

		ExecutorService executor = getExecutor();
		Map<Integer,Future<String>> results = new TreeMap<Integer,Future<String>>();

		/* setup list */
		for(int i = 1;i < this.max;i++){
			results.put(i,executor.submit(new FizzBuzzCallable(i)));
		}

		// collect result
		for (Entry<Integer,Future<String>> entry : results.entrySet()) {
			map.put(entry.getKey(), entry.getValue().get());
		}

		return map;
	}

	abstract ExecutorService getExecutor();

	class FizzBuzzCallable implements Callable<String>{
		private int val;
		FizzBuzzCallable(int i){
			this.val = i;
		}

		@Override
		public String call() throws Exception {
			return FizzBuzzFactory.FizzBuzzCalc(this.val);
		}
	}
}
