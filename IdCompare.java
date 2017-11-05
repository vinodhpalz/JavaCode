import java.util.*;
class IdCompare implements Comparator<Container>
{
	public int compare(Container c1, Container c2)
	{
		if(c1.getContainerId() > c2.getContainerId())
		{
			return 1;			
		}
		else if(c1.getContainerId() < c2.getContainerId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}