package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListFirstNullTest {
	LinkedList c = new LinkedList<String>();
	LinkedList d = new LinkedList<String>();
	
	
	

	@Test
	public void testEmpty() {
		c.add(0,null);
		d.add(0,null);
		c.add(1,3);
		d.add(1,3);
		c.add(2,5);
		c.add(3,6);
		c.add(4,7);
		c.add(5,8);
		d.add(2,5);
		d.add(3,6);
		d.add(4,7);
		d.add(5,8);
		
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	
	}
}
