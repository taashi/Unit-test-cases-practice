package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class LinkedListSmallerTestTest {

	LinkedList c = new LinkedList();
	LinkedList d = new LinkedList();
	
	
	

	@Test
	public void testEmpty() {
		c.add("5.34");
		d.add("6.34");
		d.add("2.22");
		
		JUnitCore test = new JUnitCore();
		LinkedListEquality f = new LinkedListEquality();
		int q = c.size();
		int r = d.size();
		
		boolean result = f.lessersizecheck(q,r);
		assertEquals(true,result);
	
	}

}
