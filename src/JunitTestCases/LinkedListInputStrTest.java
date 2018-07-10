package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListInputStrTest {

	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add("asd");
		c.add("zxc");
		d.add("asd");
		d.add("zxc");
		d.add("nhy");
		c.add("nhy");
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		boolean result = f.check(c,d);
		assertEquals(true,result);
	}

}


