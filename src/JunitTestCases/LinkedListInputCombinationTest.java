package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListInputCombinationTest {


	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add("5.34");
		c.add("5.34");
		c.add("6.34");
		c.add("7");
		d.add(5.34);
		d.add(5.34);
		d.add(6.34);
		d.add(7);
		
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(false,result);
	
	}
}
