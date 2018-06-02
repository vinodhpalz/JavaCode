import java.util.*;
class TestMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> m = new TreeMap<Integer, String>();
		m.put(1, "Vinodh");
		m.put(4, "Mohammed");		
		m.put(3, "Arun");
		m.put(2, "raj");
		Set s1 = m.entrySet();
		System.out.println(s1);
	}
}