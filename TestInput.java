import java.util.*;
class TestInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value:");
		String a = sc.next();
		System.out.println("Enter the Second Value:");
		String b = sc.next();
		String c = a + b;
		System.out.println("The output is: "+c);
	}
}