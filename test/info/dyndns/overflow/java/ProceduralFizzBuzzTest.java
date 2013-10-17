package info.dyndns.overflow.java;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class ProceduralFizzBuzzTest {
	@Test
	public void testMax100() {

		FizzBuzz fb = new ProceduralFizzBuzz(100);
		testFizzBuzz(fb);
		
	}

	@Test
	public void testMax50() {

		FizzBuzz fb = new ProceduralFizzBuzz(50);
		testFizzBuzz(fb);
		
	}
	
	
	@Test
	public void testMax1() {

		FizzBuzz fb = new ProceduralFizzBuzz(1);
		testFizzBuzz(fb);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUnder() {

		@SuppressWarnings("unused")
		FizzBuzz fb = new ProceduralFizzBuzz(-1);
		
	}
	
	private void testFizzBuzz(FizzBuzz fb) {
		for(Map.Entry<Integer, String> entry : fb.result().entrySet()){
			boolean three = (entry.getKey() % 3) == 0;
			boolean five  = (entry.getKey() % 5) == 0;
			
			if(three && five){
				assertEquals(FizzBuzz.FIZZBUZZ, entry.getValue());
			}else if(three){
				assertEquals(FizzBuzz.FIZZ, entry.getValue());
			}else if(five){
				assertEquals(FizzBuzz.BUZZ, entry.getValue());
			}else{
				assertEquals(entry.getKey().toString(), entry.getValue());
			}
			
		}
	}

}
