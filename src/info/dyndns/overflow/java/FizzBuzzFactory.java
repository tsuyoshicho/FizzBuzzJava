package info.dyndns.overflow.java;

import java.util.function.*;
import java.util.stream.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public class FizzBuzzFactory {
	private FizzBuzzFactory(){
		super();
	}

	// Stream Factory

	// Single Factory
	public static Stream<String> stream(){
		Supplier<String> supplier = new Supplier<String> (){
			int count = 1;
			@Override
			String get(){
				int currentCount = count;
				count++;
				return FizzBuzzCalc(currentCount);
			}
		};

		return Stream.generate(supplier);
	}

	// Procedural
	public static FizzBuzz newProceduralFizzBuzz(Integer max){
		return new ProceduralFizzBuzz(max);
	}

	//Future
	public static FizzBuzz newFutureFizzBuzz(Integer max){
		return new FutureFizzBuzz(max);
	}


	// ForkJoin
	public static FizzBuzz newForkJoinFizzBuzz(Integer max){
		return new ForkJoinFizzBuzz(max);
	}

	// Stream
	public static FizzBuzz newStreamFizzBuzz(Integer max){
		return new StreamFizzBuzz(max);
	}

	// ParallelStream
	public static FizzBuzz newParallelStreamFizzBuzz(Integer max){
		return new ParallelStreamFizzBuzz(max);
	}

	// Util
	static String FizzBuzzCalc(int i){
		String result = "";
		if(0 == (i % (3 * 5))){
			result = FizzBuzz.FIZZBUZZ;
		}else if(0 == (i % 5)){
			result =  FizzBuzz.BUZZ;
		}else if(0 == (i % 3)){
			result = FizzBuzz.FIZZ;
		}else{
			result = String.valueOf(i);
		}
		return result;
	}
}
