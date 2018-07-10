package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListUniqueTest {

	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);
		
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	
	}
}
