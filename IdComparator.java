import java.util.*;
class IdComparator implements Comparator<Product>
{
	public int compare(Product p1, Product p2)
	{
		if(p1.getPid() > p2.getPid())
		{
			return 1;
		}
		else if(p1.getPid() < p2.getPid())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}