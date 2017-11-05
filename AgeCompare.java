import java.util.*;
class AgeCompare implements Comparator<Container>
{
	public int compare(Container c1, Container c2)
	{
		if(c1.getContainerAge() > c2.getContainerAge())
		{
			return 1;			
		}
		else if(c1.getContainerAge() < c2.getContainerAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
