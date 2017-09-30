package info.dyndns.overflow.java;

import java.util.*;

/**
 * @author Tsuyoshi CHO
 * License GPLv2 or later
 * SampleMain
 */
public class SampleFizzBuzzMain {

	public static void main(String[] args) {
		final Integer max = 50;
		List<FizzBuzz> funcList = Arrays.asList(
				FizzBuzzFactory.newProceduralFizzBuzz(max),
				FizzBuzzFactory.newFutureFizzBuzz(max),
				FizzBuzzFactory.newForkJoinFizzBuzz(max),
				FizzBuzzFactory.newStreamFizzBuzz(max),
				FizzBuzzFactory.newParallelStreamFizzBuzz(max)
				);

		for(FizzBuzz fizzbuzz: funcList){
			Map<Integer,String> result = fizzbuzz.result();

			System.out.println("FizzBuzz " + fizzbuzz + ",total:" + result);
		}
	}
}
