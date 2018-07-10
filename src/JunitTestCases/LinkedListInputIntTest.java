package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListInputIntTest {

	LinkedList c = new LinkedList<Integer>();
	LinkedList d = new LinkedList<Integer>();
	
	
	

	@Test
	public void testEmpty() {
		c.add(5);
		c.add(6);
		d.add(5);
		d.add(6);
		d.add(2);
		c.add(2);
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	}
}
