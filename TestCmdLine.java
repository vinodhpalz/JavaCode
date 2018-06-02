//Command Line Argument
class TestCmdLine
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}
}