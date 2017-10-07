package info.dyndns.overflow.java;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.util.stream.*;

public class FizzBuzzFactoryTest {
	@Test
	public void testFizzBuzzFacoryStream() {
		Map<Integer, String> map = new HashMap<Integer,String>();

		int count = 100;
		List<String> list = FizzBuzzFactory.stream().limit(count).collect(Collectors.toList());

		int index = 1;
		for(String fb : list){
			map.put(index,fb);
			index++;
		}

		for(Map.Entry<Integer, String> entry : map.entrySet()){
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
