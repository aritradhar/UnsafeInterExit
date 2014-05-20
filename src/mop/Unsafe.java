package mop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Unsafe 
{

	public static void main(String[] args) 
	{
		//System.exit(1);
		Collection<String> c=new ArrayList<>();
		c.add("Aritra");
		c.add("Aritra");
		//c.add("Aritra");
		//c.add("Dhar");
		int counter=removal(c);
		System.out.println(counter);
		System.err.println(c);
		
		System.exit(1);
	}
	
	public static int removal(Collection<String> c)
	{
		Integer cnt=0;
		for(Iterator<String> i=c.iterator();i.hasNext();)
		{
			String s=i.next();
			cnt++;
			//System.out.println("Inside removal: "+cnt);
			if(s.equals("Aritra"))
			{
				c.remove(s);
				c.removeAll(c);
			}
		}
		return cnt;
	}

}
