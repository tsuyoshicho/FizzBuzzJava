package info.dyndns.overflow.java;

import static org.junit.Assert.*;
import java.util.Map;
import org.junit.Test;

public class StreamFizzBuzzTest {
	@Test
	public void testResultCount() {
		int count = 10;
		FizzBuzz fb = FizzBuzzFactory.newStreamFizzBuzz(count+1);
		assertEquals("count:" + count + " result:" + fb.result().size(),count ,fb.result().size());
	}

	@Test
	public void testMax100() {
		FizzBuzz fb = FizzBuzzFactory.newStreamFizzBuzz(100);
		testFizzBuzz(fb);
	}

	@Test
	public void testMax50() {
		FizzBuzz fb = FizzBuzzFactory.newStreamFizzBuzz(50);
		testFizzBuzz(fb);
	}

	@Test
	public void testMax1() {
		FizzBuzz fb = FizzBuzzFactory.newStreamFizzBuzz(1);
		testFizzBuzz(fb);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUnder() {
		@SuppressWarnings("unused")
		FizzBuzz fb = FizzBuzzFactory.newStreamFizzBuzz(-1);
	}

	private void testFizzBuzz(FizzBuzz fb) {
		for(Map.Entry<Integer, String> entry : fb.result().entrySet()){
			boolean three = (entry.getKey() % 3) == 0;
			boolean five  = (entry.getKey() % 5) == 0;

			if(three && five){
				assertEquals("Fail:"+"key:"+entry.getKey()+","+"value:"+entry.getValue(),
										FizzBuzz.FIZZBUZZ, entry.getValue());
			}else if(three){
				assertEquals("Fail:"+"key:"+entry.getKey()+","+"value:"+entry.getValue(),
										FizzBuzz.FIZZ, entry.getValue());
			}else if(five){
				assertEquals("Fail:"+"key:"+entry.getKey()+","+"value:"+entry.getValue(),
										FizzBuzz.BUZZ, entry.getValue());
			}else{
				assertEquals("Fail:"+"key:"+entry.getKey()+","+"value:"+entry.getValue(),
										entry.getKey().toString(), entry.getValue());
			}
		}
	}
}
