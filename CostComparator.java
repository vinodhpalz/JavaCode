import java.util.*;
class CostComparator implements Comparator<Product>
{
	public int compare(Product p1, Product p2)
	{
		if(p1.getPcost() > p2.getPcost())
		{
			return -1;
		}
		else if(p1.getPcost() < p2.getPcost())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}