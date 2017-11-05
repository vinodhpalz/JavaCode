import java.util.*;
class TestMap
{
	public static void main(String[] args)
	{
		Map<String, String> m = new HashMap<String, String>();
		m.put("1","Raj");
		m.put("3","Arjun");
		m.put("2","Krishna");
		m.put("4","Sadiq");
		Collection c = m.values();
		System.out.println(c);
		Set s = m.keySet();
		System.out.println(s);
		Set s1 = m.entrySet();
		System.out.println(s1);
		System.out.println(m.get("3"));
	}
}