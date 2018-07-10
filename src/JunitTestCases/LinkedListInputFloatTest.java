package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListInputFloatTest {

	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add(5.34);
		c.add(6.34);
		d.add(5.34);
		d.add(6.34);
		d.add(2.22);
		c.add(2.22);
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	}


}
