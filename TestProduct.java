import java.util.*;
class TestProduct
{
	public static void main(String[] args)
	{
		IdComparator idc = new IdComparator();
		CostComparator cc = new CostComparator();
		List<Product> s = new ArrayList<Product>();
		Product prd = new Product(10,30);
		s.add(prd);
		s.add(new Product(11,55));
		s.add(new Product(4,40));
		s.add(new Product(14,70));
		Collections.sort(s, cc);
		for(Product p: s)
		{
			System.out.println(p.getPid()+" "+p.getPcost());
		}
	}
}