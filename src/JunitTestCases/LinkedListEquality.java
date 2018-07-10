package JunitTestCases;

import java.util.LinkedList;

public class LinkedListEquality {
	LinkedList a = new LinkedList();
	LinkedList b = new LinkedList();
	
	public boolean  check(LinkedList a,LinkedList b)
	{
	 return  a.equals(b);

	}
	public boolean sizecheck(int v, int w)
	{
		if(v==w)
		{
			return true;
		}
		else
			return false;
	}
	public boolean greatersizecheck(int c, int d)
	{
		if(c>d)
		{
			return true;
		}
		else
			return false;
	}
	public boolean lessersizecheck(int t, int u)
	{
		if(t<u)
		{
			return true;
		}
		else
			return false;
	}
	
	
}