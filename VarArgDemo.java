public class VarArgDemo
{
	public void display(int... a)
	{
		for(int i: a)
		{
			System.out.println(i);	
		}
	}
	public static void main(String[] args)
	{
		VarArgDemo  obj = new VarArgDemo();
		obj.display(10,20,30,40,50);
	}
}