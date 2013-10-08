package info.dyndns.overflow.java;

import java.util.*;
import java.util.concurrent.*;

class FutureFizzBuzz extends AbstractFizzBuzz {
	FutureFizzBuzz(Integer max) {
		super(max);
	}

	ExecutorService getExecutor(){
		return Executors.newFixedThreadPool(Math.min(Runtime.getRuntime().availableProcessors(), this.max/10));
	}
	
	@Override
	Map<Integer, String> createResult(Map<Integer, String> map) {
		
		ExecutorService executor = getExecutor();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>(max);

		for(int i = 0;i < this.max;i++){
			results.add(i,executor.submit(new FizzBuzzCallable(i)));
		}

		try {
			for(int i = 0;i < this.max;i++){
				map.put(i, results.get(i).get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		return map;
	}
	
	private class FizzBuzzCallable implements Callable<String>{
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
