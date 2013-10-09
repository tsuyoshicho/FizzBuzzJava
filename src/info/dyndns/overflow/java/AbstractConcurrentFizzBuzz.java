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
		ArrayList<Callable<String>> worker = new ArrayList<Callable<String>>(max);
	
		/* setup list */
		for(int i = 0;i < this.max;i++){
			worker.add(i,new FizzBuzzCallable(i));
		}
	
		List<Future<String>> results;
		try {
			results = executor.invokeAll(worker);
			for(int i = 0;i < results.size();i++){
				map.put(i, results.get(i).get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
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