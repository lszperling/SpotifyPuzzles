


import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest {

	@Test
	public void testCompare() {
		Song aLot = new Song(1,1000,"the one");
		Song notSoMuch = new Song(2,20,"not cool");
		
		assertEquals(notSoMuch.compareTo(aLot), 1);
	}
	
	@Test
	public void testCompareTie() {
		Song aLot = new Song(1,1000,"the one");
		Song notSoMuch = new Song(2,500,"not cool");
		
		assertEquals(notSoMuch.compareTo(aLot), 1);
	}

}