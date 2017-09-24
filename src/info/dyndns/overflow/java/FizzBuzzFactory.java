package info.dyndns.overflow.java;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 *
 */
public class FizzBuzzFactory {
	private FizzBuzzFactory(){
		super();
	}

	// Procedural
	static FizzBuzz newProceduralFizzBuzz(Integer max){
		return new ProceduralFizzBuzz(max);
	}

	//Future
	static FizzBuzz newFutureFizzBuzz(Integer max){
		return new FutureFizzBuzz(max);
	}


	// ForkJoin
	static FizzBuzz newForkJoinFizzBuzz(Integer max){
		return new ForkJoinFizzBuzz(max);
	}

	// Stream
	static FizzBuzz newStreamFizzBuzz(Integer max){
		return new StreamFizzBuzz(max);
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
