package info.overflow.java;

import java.util.*;

public class testFizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 50;
		List<FizzBuzz> funcList = Arrays.asList(
				FizzBuzzFactory.newProceduralFizzBuzz(max),
				FizzBuzzFactory.newFutureFizzBuzz(max),
				FizzBuzzFactory.newForkJoinFizzBuzz(max)
				);
		
		for(FizzBuzz fizzbuzz: funcList){
			Map<Integer,String> result = fizzbuzz.result();
            /*
			for(Map.Entry<Integer, String> entry : result.entrySet()){
				System.out.println("FizzBuzz:" + entry.getKey().toString() + ":" + entry.getValue());
			}
			*/
			System.out.println("FizzBuzz " + fizzbuzz.toString() + ",total:" + result.toString());
		}
	}
}