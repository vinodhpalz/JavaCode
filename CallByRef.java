class CallByRef
{
	int a, b;
	public CallByRef(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public static void swap(CallByRef ob)
	{
		int temp;
		temp = ob.a;
		ob.a = ob.b;
		ob.b = temp;
		ob.display();			
	}
	public void display()
	{
		System.out.println(a+" "+b);
	}
} 
class TestCallByRef
{
	public static void main(String[] args)
	{
		CallByRef obj = new CallByRef(10,20);
		CallByRef.swap(obj);
		obj.display();
		
	}
} 
