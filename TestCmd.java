import java.util.Scanner;
class TestCmd
{
	public static void main(String[] abc)
	{
		boolean b1 = false;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a = sc.nextInt();
			System.out.println("Enter the Second number");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			b1 = true;
			e.printStackTrace();	
		}
		finally
		{
			System.out.println("Finally Block Works");
			if(b1)
			return;	
		}
		System.out.println("Execution Continues");
								
	}
}






