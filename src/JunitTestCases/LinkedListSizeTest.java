package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListSizeTest {

	
	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add(4);
		c.add(5);
		d.add(4);
		d.add(5);
		d.add(6);
		c.add(6);
//		c.add(7);
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		int q = c.size();
		int r = d.size();
		boolean result = f.sizecheck(q,r);
		assertEquals(true,result);
	}

}



