import java.util.*;
class TestContainer
{
	public static void main(String[] args)
	{
		IdCompare ic = new IdCompare();
		Set<Container> l = new TreeSet<Container>(ic);
		l.add(new Container(100,10));
		l.add(new Container(101,14));
		l.add(new Container(99,12));
		l.add(new Container(103,15));
		for(Container cnt: l)
		{
			System.out.println(cnt.getContainerId()+" "+cnt.getContainerAge());
		}
		Iterator<Container> itr = l.iterator();
		while(itr.hasNext())
		{
			Container cnt = itr.next();
			System.out.println(cnt.getContainerId()+" "+cnt.getContainerAge());	
		}
	}
}