package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListNullTest {

	LinkedList c = new LinkedList<String>();
	LinkedList d = new LinkedList<String>();
	
	
	

	@Test
	public void testEmpty() {
		c.add(0,null);
		d.add(0,null);
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	
	}

}
